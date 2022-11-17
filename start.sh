#!/bin/bash

#pull new changes
git pull

#prepare jar
mvn clean
mvn package

#ensure, that docker-compose stopped
docker-compose stop

#add environment variables
export BOT_USERNAME=$1
export BOT_TOKEN=$2

#start new deployment
docker-compose up --build -d