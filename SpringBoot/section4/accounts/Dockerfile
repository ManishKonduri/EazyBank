# Use the official OpenJDK 17 slim image as the base image
FROM openjdk:21-jdk-slim

# Set the maintainer label for the image
MAINTAINER makon.com

# Copy the built JAR file from the target directory into the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# Set the entry point to run the JAR file using Java
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]