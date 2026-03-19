FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY target/supabase-demo-1.0.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]