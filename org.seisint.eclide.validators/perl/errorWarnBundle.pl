#
# generates a resource bundle containing compiler error and warning explanations
# as documented in 'perldiag'
#
use strict;
use warnings;

use IO::File;

use Pod::Find;
use Pod::POM;

use constant {
    FILENAME => 'errorsAndWarnings',
    SUFFIX   => 'properties',
};

## main

my $dir = $ARGV[0];
_validateDir($dir);

my $pom  = _parse_pod();
my $file = _getOutputFileHandle($dir, FILENAME);

my $idx = 0;
foreach my $item ($pom->head1->[1]->over->[0]->item)
{
    my $header  = _prep_header($item->title);
    my $content = $item->content;

    # skip entries that don't have any content
    if (!($content && $content ne ''))
    {
        next;
    }

    $content  = _prep_content($item->content);

    printf STDERR "E%d=%s\t%s\n", $idx++, $header, $content;
    printf $file "E%d=%s\t%s\n", $idx++, $header, $content;
}

## private

sub _find_pod_file
{
    my $file = Pod::Find::pod_where({-inc => 1}, 'perldiag');
    if (!$file)
    {
        print STDERR "unable to find pod for 'perldiag', aborting...\n";
        exit(1);
    }

    return $file;
}

sub _getOutputFileHandle
{
    my $file = sprintf '%s.%s', File::Spec->catfile(@_), SUFFIX;
    printf STDERR "creating bundle: %s\n", $file;

    return IO::File->new($file, 'w');
}

sub _parse_pod
{
    my $file   = _find_pod_file();
    my $parser = Pod::POM->new();

    my $parsed = $parser->parse_file($file);
    if (!$parsed)
    {
        printf STDERR "unable to parse diag pod: %s\n", $parser->error;
        exit(1);
    }

    return $parsed;
}

sub _prep_content
{
    my ($text) = @_;

    # remove any trailing newlines at the end of the document
    $text =~ s/\n+$//g;

    # replace slashes and newlines for java
    $text =~ s/\\/\\\\/g;
    $text =~ s/\n/\\n/g;

    # replace tabs w/ a single space
    $text =~ s/\t/ /g;
    # single space everything
    $text =~ s/\s{2,}/ /g;

    return $text;
}

sub _prep_header
{
    my ($text) = @_;

    # replace any leading white space
    $text =~ s/^\s//g;

    #$text =~ s/\\/./g;

    # replace '(){}[]$?|*+' with '\\$1'
    $text =~ s/([\(\)\{\}\[\]\$\?\|\*\+\\])/\\\\$1/g;

    # replace '%s %c %d %lx' with '.*?'
    $text =~ s/%([sdcl][x]{0,1})/.*?/g;

    # replace '%.[0-9]s' with '.*?'
    $text =~ s/%\.[0-9]s/.*?/g;

    return $text;
}

sub _validateDir
{
    my ($dir) = @_;

    if (!$dir)
    {
        printf "usage: %s <path_to_bundle_location>\n", $0;
        exit(1);
    }

    if (!(-e $dir && -d $dir))
    {
        printf "invalid output directory: %s\n", $dir;
        exit(1);
    }
}

