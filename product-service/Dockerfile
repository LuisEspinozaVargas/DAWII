# Usa una imagen base con JDK 17
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo .jar generado por Maven (asegúrate de que el .jar esté en el directorio /target)
ARG JAR_FILE=target/product-service-*.jar
COPY ${JAR_FILE} app.jar

# Expón el puerto en el que corre el servicio
EXPOSE 8082

# Ejecuta el servicio cuando se inicie el contenedor
ENTRYPOINT ["java", "-jar", "app.jar"]
