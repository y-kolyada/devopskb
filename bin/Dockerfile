# Use a minimal base image for Java
FROM amazoncorretto:17-alpine as corretto-jdk

# required for strip-debug to work
RUN apk add --no-cache binutils=2.40-r7

# Build small JRE image
RUN jlink \
         --add-modules ALL-MODULE-PATH \
         --strip-debug \
         --no-man-pages \
         --no-header-files \
         --compress=2 \
         --output /jre

FROM alpine:3.18.4

ENV JAVA_HOME=/jre
ENV PATH="${JAVA_HOME}/bin:${PATH}"

COPY --from=corretto-jdk /jre $JAVA_HOME

# Set the working directory in the container
WORKDIR /app

# Set the MAIN_CLASS environment variable
ENV MAIN_CLASS="link.kolyada.devops.devopskb.DevopskbApplication"

# Copy the JAR file into the container
COPY devopskb.jar /app/devopskb.jar

# Expose the port your Spring application will run on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "devopskb.jar"]
