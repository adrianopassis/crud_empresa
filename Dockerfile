FROM ubuntu:latest
LABEL authors="adria"

ENTRYPOINT ["top", "-b"]