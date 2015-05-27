EclipsePlugin
----------

Building with Maven:
----------
From the project root directory, execute <b>mvn clean verify</b><br/>or if assign a new version cross all components:<ol><li><b>mvn clean</b></li><li><b>mvn -Dtypcho.mode=maven org.eclipse.tycho:tycho-versions-plugin:set-version -DnewVersion=&lt;New Version&gt;</b></li><li><b>mvn verify</b></li></ol>

To sign the code, execute <b>mvn -P hpcc.sign jarsigner:verify</b>.<br/><br/>
NOTE:  Certain file types in the <b>build.properties</b> file in the <b>org.hpccsystems.ecldoc</b> project have been removed to eliminate compile errors with Maven.  When those file types exist in that project, the original <b>build.properties</b> can be restored. The variables for code signing (jarsigner plugin) should be defined in Maven global or user configuration file with profile name <b>"hpcc.sign"</b>, for example &lt;MAVEN_HOME&gt;/conf/settings.xml.
