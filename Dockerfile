FROM alpine:latest
MAINTAINER fhj_sdm 

#Installer git et vim
RUN apk update&& \
    apk add git&& \
    apk add vim

#Installation de Java
RUN apk add openjdk8

RUN mkdir /data

#Récuperation du programme
COPY ./hello_world.java /data/hello_world.java

#Repertoire d'exécution du programme
WORKDIR /data

#Compilation du programme
RUN javac hello_world.java

#Exécution du programme
CMD ["java", "hello_world"]
