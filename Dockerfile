FROM openjdk:18
WORKDIR /
EXPOSE 9090
ADD ./kubedocker-0.0.1-SNAPSHOT.jar ./kubedocker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","-Duser.timezone=GMT+0530","kubedocker-0.0.1-SNAPSHOT.jar"]