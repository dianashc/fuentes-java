FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} CrudTipoCambio-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/CrudTipoCambio-0.0.1-SNAPSHOT.jar"]