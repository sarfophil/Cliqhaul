# Start with a base image containing Java runtime
FROM alpine

ENV JAVA_HOME="/usr/lib/jvm/default-jvm/"
RUN apk add openjdk11


# Add the application's jar to the container
ARG JAR_FILE=target/*.jar

# Copy Jar file to the container
COPY ${JAR_FILE} registery.jar

# Run the jar file
ENTRYPOINT ["java","-jar","/registery.jar"]