FROM openjdk:8-jre-alpine

WORKDIR /swagger-converter

COPY target/lib/jetty-runner.jar /swagger-converter/jetty-runner.jar
COPY target/*.war /swagger-converter/server.war
COPY src/main/swagger/swagger.yaml /swagger-converter/
COPY inflector.yaml /swagger-converter/

EXPOSE 8080

CMD ["java", "-jar", "-DswaggerUrl=swagger.yaml", "/swagger-converter/jetty-runner.jar", "/swagger-converter/server.war"]

