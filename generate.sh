#!/bin/bash

docker run -v $(pwd):/src fint-model:latest --tag arkiv generate --resource

rm -rf src/main/java/no/fint/model/administrasjon/arkiv
mv java/administrasjon/arkiv src/main/java/no/fint/model/administrasjon
rm -rf src/main/java/no/fint/model/kultur
mv java/kultur src/main/java/no/fint/model

rm -rf src/main/java/no/fint/model/resource/administrasjon/arkiv
mv java/resource/administrasjon/arkiv src/main/java/no/fint/model/resource/administrasjon
rm -rf src/main/java/no/fint/model/resource/kultur
mv java/resource/kultur src/main/java/no/fint/model/resource
