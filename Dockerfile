FROM openjdk:17
EXPOSE 8080
ADD target/springboot-github-docker.jar springboot-github-docker.jar
ENTRYPOINT ["java", "-jar", "/springboot-github-docker.jar"]