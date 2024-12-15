
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado por Maven/Gradle
COPY target/bff-service-0.0.1-SNAPSHOT.jar bff-service.jar

# Exponer el puerto que usa el microservicio
EXPOSE 8080

# Comando para ejecutar el microservicio
ENTRYPOINT ["java", "-jar", "bff-service.jar"]