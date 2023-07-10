# Irish Creatives & Artists API

# Overview
This is a REST API designed to provide a simple and standardized way of accessing and manipulating data related to contemporary Irish artists and creatives. The project uses the Spring Boot framework with Spring MVC, Spring Data JPA, and an H2 in-memory database.

# Getting Started
Java Development Kit (JDK) version 8 or higher  
Maven (for dependency management)  
IDE of your choice (e.g., IntelliJ IDEA, Eclipse)  
Postman (Testing)    

Clone the repository to your local machine:  

```
git clone https://github.com/<sheeehy>/contemporary-irish-artists-api.git
cd contemporary-irish-artists-api
```

To build the project and run all tests, use:  
```
mvn clean install
```  
To start the server, use:
```
mvn spring-boot:run
```
Use the following command to run tests or use Postman:  
```
mvn test
```

# API Endpoints  
GET /artists: Retrieves a list of all artists  
GET /artists/{id}: Retrieves a single artist by ID  
POST /artists: Creates a new artist  
PUT /artists/{id}: Updates an existing artist  
DELETE /artists/{id}: Deletes an artist  
