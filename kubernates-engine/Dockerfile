FROM eclipse-temurin:21-jre-alpine
VOLUME /tmp
COPY target/kubernates-engine-1.0-SNAPSHOT-exec.jar app.jar
#ENV JAVA_OPTS=""
ENTRYPOINT java -jar /app.jar