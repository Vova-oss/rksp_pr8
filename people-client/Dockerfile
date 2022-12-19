FROM openjdk:18
COPY target/people-client-0.0.1-SNAPSHOT.jar app.jar
COPY ./target/classes/ ./.
ENTRYPOINT ["java","-jar","app.jar"]