# httpKodes

complile the project with mvn clean package
run it locally with java -jar target/HttpCodes-1.0-SNAPSHOT.jar

query the API from browser with localhost:8080/codes?code=<valid http code>
ie: localhost:8080/codes?code=101

You can also query the API from postman with localhost:8080/codeswithheaders?codestatus=400
and this call will return the status code and more importantly the correct
header for the code.
