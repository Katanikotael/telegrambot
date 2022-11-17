#!/bin/bash

#ensure, that docker-compose stopped
docker-compose stop

#ensurem that the old application won't be deployed again
mvn clean
