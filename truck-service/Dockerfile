# Start with a base image containing Java runtime
FROM openjdk:11
FROM maven:3.6.3-jdk-11

# ENV JAVA_HOME="/usr/lib/jvm/java-11-openjdk-amd64/bin"
# RUN apk add openjdk11

# Wait 
ENV WAIT_VERSION 2.7.2
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/${WAIT_VERSION}/wait /wait
RUN chmod +x /wait


# Copy project files to container
COPY pom.xml /tmp/truck_service/
COPY src /tmp/truck_service/src/
WORKDIR /tmp/truck_service/

# wait for dependency to run before starting
CMD /wait && mvn spring-boot:run


