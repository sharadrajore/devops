FROM openjdk:8-alpine

COPY /target/hello-world.jar .

CMD ["java","-jar","hello-world.jar"]





