FROM debian:bullseye-20240513-slim
ENV DEBIAN_FRONTEND=noninteractive
ENV MAVEN_VERSION=3.8.6
ENV JAVA_VERSION=19.0.1-amzn
ENV SDKMAN_DIR=/root/.sdkman

RUN apt-get update && \
    apt-get --no-install-recommends -y install \
    git \
    zip \
    unzip \
    sed \
    jq && \
    rm -rf /var/lib/apt/lists/*

RUN rm /bin/sh && ln -s /bin/bash /bin/sh

RUN curl -s "https://get.sdkman.io" | bash


RUN bash -c source "$HOME/.sdkman/bin/sdkman-init.sh && \
    yes | sdk install java 19.0.1-amzn && \
    yes | sdk install maven 3.8.6 && \
    rm -rf $HOME/.sdkman/archives/* && \
    rm -rf $HOME/.sdkman/tmp/*"
    
RUN curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o "awscliv2.zip" && \
    unzip awscliv2.zip && \
    ./aws/install

CMD [ "/bin/bash" ]
