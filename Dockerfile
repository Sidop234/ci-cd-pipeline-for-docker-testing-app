# Step 1: Use an official Java runtime as base image
FROM openjdk:19-jdk-slim

# Step 2: Set working directory
WORKDIR /app

# Step 3: Copy your jar file into the container
COPY target/learning_docker-0.0.1-SNAPSHOT.jar app.jar


# Step 4: Run the jar file
ENTRYPOINT ["java", "-jar", "app.jar"]
