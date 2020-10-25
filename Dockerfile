FROM openjdk:11

ARG WAR_FILE=target/bugtracker-0.0.1-SNAPSHOT.war

COPY ${WAR_FILE} app.war

EXPOSE 8080

CMD java -jar app.war

