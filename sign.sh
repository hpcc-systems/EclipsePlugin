#!/bin/bash

run_jarsigner()
{
   for jar_file in $(ls -r $1)
   do
       echo
       echo $jar_file
       echo "jarsigner -storetype pkcs12 --digestalg SHA1 -sigalg MD5withRSA -keystore ${KEYSTORE} storepass ${STOREPASS} -tsa ${TSA} -verbose ${jar_file} 1"
       jarsigner -storetype pkcs12 --digestalg SHA1 -sigalg MD5withRSA -keystore "${KEYSTORE}" storepass "${STOREPASS}" -tsa "${TSA}" -verbose "${jar_file}" 1
   done

}

JARSIGNER=jarsigner
KEYSTORE=/tmount/data3/build/windows/sign/current/hpcc_code_signing.pfx
TSA=https://timestamp.geotrust.com/tsa
STOREPASS=$(cat /tmount/data3/build/windows/sign/passphrase.txt)

run_jarsigner "./org.hpccsystems.updatesite/target/site/features/*.jar"

run_jarsigner "./org.hpccsystems.updatesite/target/site/plugins/*.jar"
