FROM ubuntu:22.04

RUN apt update && apt install -yq \
    python3 git git-lfs default-jdk \
    ffmpeg wget vim bash sudo curl \
    && apt-get clean && rm -rf /var/lib/apt/lists/* /tmp/*
RUN echo 'eaglervm' > /etc/hostname
RUN useradd -l -u 33333 -G sudo -md /home/gitpod -s /bin/bash -p gitpod gitpod
USER gitpod
ENV SHELL=/usr/bin/bash
