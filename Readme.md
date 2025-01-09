### Template for project Spring Boot 2.5.6 and Maven

Set JAVA 17:

````shell
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
````

or

````shell
$ echo $JAVA_HOME
/usr/lib/jvm/java-17-openjdk-amd64
````

Set JAVA 11:

````shell
export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
````

Run unit test:

````shell
./mvnw test
````

Run app:
````shell
./mvnw spring-boot:run
````

Request test:

````shell
http :8780/api/echo/
````
