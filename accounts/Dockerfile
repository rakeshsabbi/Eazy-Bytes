#Start with a base image containg Java runtime
FROM openjdk:21-jdk-slim

#Information of the maintainer/author
LABEL "org.opencontainers.image.authors"="RakeshSabbisetty"

#Add the application jar to the image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]