FROM openjdk:11.0.6-jre-slim
COPY ./target/InventoryDB-API.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java","-jar","InventoryDB-API.jar"]
