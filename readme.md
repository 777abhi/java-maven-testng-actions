docker build --pull --rm -f "Dockerfile" -t testjavamaven:latest "."

docker build -t testjavamaven:latest --platform linux/amd64 .
docker build -t testjavamaven:latest --platform linux/arm64 .


docker start testjavamaven bash
docker run testjavamaven bash

CMD ["mvn", "--version"]

RUN set -x && \
    echo "sdkman_auto_selfupdate=false" >> $SDKMAN_DIR/etc/config && \
    echo "sdkman_insecure_ssl=false" >> $SDKMAN_DIR/etc/config


RUN [[ -s "$SDKMAN_DIR/bin/sdkman-init.sh"]] && source "$SDKMAN_DIR/bin/sdkman-init.sh" && exec "$@"

RUN source /root/.bashrc

docker exec -it testja /bin/bash

docker start e2914616803b0d86df68464d9beb24eff6c5e5d246e9f709918b115780423b8c

docker run -it testjavamaven


mvn clean test -Dsurefire.suiteXmlFiles=testng.xml -q

# List all docker containers 
docker ps -a

# Delete all containers
docker rm -f $(docker ps -aq)

# Delete docker images 
docker rmi IMAGE_NAME
docker rmi -f $(docker images -q)



