FROM openjdk:18
COPY target/api-gateway-0.0.1-SNAPSHOT.jar app.jar
COPY ./target/classes/ ./.
ENTRYPOINT ["java","-jar","app.jar"]