# Fetch API
This is a Maven project to fetch questions and submit answers ,with facility to check the documentation and heath parameters of the API.


HOW TO RUN:

This application is packaged as a war which has Tomcat 8 embedded. No Tomcat or JBoss installation is necessary. You run it using the java -jar command.

Make sure you are using JDK 1.8 and Maven 3.x.You can build the project and run the tests by running mvn clean package.

Once successfully built, you can run the service by :
java -jar path\to\jar\file\fetchq-api-0.0.1-SNAPSHOT.jar
 
Once the application runs you should see something like this:
2020-08-30 17:46:50.237  INFO 13652 --- [           main] s.b.c.e.t.TomcatEmbeddedServletContainer : Tomcat started on port(s): 8080 (http)
2020-08-30 17:46:50.247  INFO 13652 --- [           main] com.genkwiz.starter.FetchApp             : Started FetchApp in 10.062 seconds (JVM running for 10.826)
 
About the Service

The service is just a simple fetch and submit API. It uses an external database to store the data. Here we have used PostgreSQL. If your database connection properties work, you can call some REST endpoints defined in com.genkwiz.starter.Question.QuestionController on port 8080. 

More interestingly, you can start calling some of the operational endpoints (see full list below) like /metrics and /health 

Here is what this little application demonstrates:
Full integration with the latest Spring Framework: inversion of control, dependency injection, etc.
Packaging as a single war with embedded container (tomcat 8): No need to install a container separately on the host just run using the java -jar command
Demonstrates how to set up healthcheck, metrics, info, environment, etc. endpoints automatically on a configured port. Inject your own health / metrics info with a few lines of code.

Writing a RESTful service using annotation: supports both XML and JSON request / response; simply use desired Accept header in your request
Exception mapping from application exceptions to the right HTTP response with exception details in the body
Spring Data Integration with JPA/Hibernate with just a few lines of configuration and familiar annotations.
Automatic CRUD functionality against the data source using Spring Repository pattern

API is "self-documented" by Swagger2 using annotations

Here are some endpoints you can call:
Get information about system health, configurations, etc.

http://localhost:8080/env

http://localhost:8080/health

http://localhost:8080/info

http://localhost:8080/metrics
 
To view Swagger 2 API docs
   Run the server and browse to localhost:8080/swagger-ui.html
Running the project with PostGres
Converting it to run with another relational database such as PostgreSQL is very easy. 
Here is what you would do to back the services with PostGres, for example:
In pom.xml add:
    <dependency>
    <groupId>postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>9.0-801.jdbc4</version>
    <scope>runtime</scope>
   </dependency>
 
Append this to the end of application.properties:
 
spring.jpa.database=POSTGRESQL
spring.datasource.platform=postgres
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=<<your username>>
spring.datasource.password=<<your password>>
spring.jpa.show-sql=true
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
