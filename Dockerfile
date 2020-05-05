# This is Dockerfile for my SpringBoot Application

FROM openjdk:8-jdk-alpine

EXPOSE 8888

ARG JAR_FILE=/target/*.jar

COPY ${JAR_FILE} jokes.jar

RUN echo "Creating docker image for spring boot application"

MAINTAINER "Shahbaz Ikram"

ENTRYPOINT ["java", "-jar", "jokes.jar"]