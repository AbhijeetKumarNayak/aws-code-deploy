FROM openjdk:8
EXPOSE 8080
ADD target/aws-code-deploy.jar aws-code-deploy.jar 
ENTRYPOINT ["java","-jar","/aws-code-deploy.jar"]
