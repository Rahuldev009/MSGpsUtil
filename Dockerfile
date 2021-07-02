FROM adoptopenjdk:11-jre-hotspot
COPY build/libs/msGpsUtil-1.0.0.jar msgpsutil.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "msgpsutil.jar"]