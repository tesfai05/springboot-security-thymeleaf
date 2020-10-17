FROM openjdk:8
EXPOSE 9090
ADD target/springboot-security-thymeleaf.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]