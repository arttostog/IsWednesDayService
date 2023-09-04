FROM openjdk:17
COPY target/IsWednesdayService.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]