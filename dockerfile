FROM openjdk:17
EXPOSE 8080
ADD target/myairline1-docker.jar myairline1-docker.jar
ENTRYPOINT ["java","-jar","myairline1-docker.jar"]