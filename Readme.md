### Template for project Spring Boot 2.5.6 and Maven

Set JAVA 17:

````shell
$ export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64
$ echo $JAVA_HOME
/usr/lib/jvm/java-17-openjdk-amd64
````

Set JAVA 11:

````shell
$ export JAVA_HOME=/usr/lib/jvm/java-11-openjdk-amd64
$ echo $JAVA_HOME
/usr/lib/jvm/java-11-openjdk-amd64
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

Use Jetty server:

````xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-tomcat</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-jetty</artifactId>
        </dependency>
````