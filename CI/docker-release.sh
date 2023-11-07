#!/bin/bash

CUR=$(pwd)

SC_RELEASE_TAG="v$SC_VERSION"

echo "docker tag:"
echo "$SC_RELEASE_TAG"

export DOCKER_CONVERTER_IMAGE_NAME=swaggerapi/swagger-converter
docker build --rm=false -t $DOCKER_CONVERTER_IMAGE_NAME:$SC_RELEASE_TAG .
docker tag $DOCKER_CONVERTER_IMAGE_NAME:$SC_RELEASE_TAG $DOCKER_CONVERTER_IMAGE_NAME:latest
docker push $DOCKER_CONVERTER_IMAGE_NAME:$SC_RELEASE_TAG
docker push $DOCKER_CONVERTER_IMAGE_NAME:latest
echo "docker images:"
docker images | grep -i converter
