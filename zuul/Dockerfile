# Start with a base image containing Java runtime
FROM openjdk:11
FROM maven:3.6.3-jdk-11

# Wait
ENV WAIT_VERSION 2.7.2
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/${WAIT_VERSION}/wait /wait
RUN chmod +x /wait


COPY pom.xml /tmp/zuul/
COPY src /tmp/zuul/src/
WORKDIR /tmp/zuul/


CMD /wait && mvn spring-boot:run
