FROM adoptopenjdk/openjdk11:jre-11.0.16.1_1-ubuntu
ARG JAR_FILE=target/*.jar
RUN mkdir /opt/app
COPY ${JAR_FILE} /opt/app/app.jar
RUN chmod +x "/opt/app/app.jar"
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/opt/app/app.jar"]