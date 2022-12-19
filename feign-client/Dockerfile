FROM openjdk:18
COPY target/feign-client-0.0.1-SNAPSHOT.jar app.jar
COPY ./target/classes/ ./.
ENTRYPOINT ["java","-jar","app.jar"]