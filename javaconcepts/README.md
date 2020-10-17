# My Java Tutorials
* Create Project: ***Preferred Approach for command line use***
```
mvn archetype:generate -DgroupId=com.javaconcepts.app -DartifactId=javaconcepts -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
**NOTE:** If you need a base scaffolding with more batteries included, use this instead:
```
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

* Compile and Execute:
```
mvn clean install assembly:single
java -jar target/javaconcepts-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## Code Structure
```
.
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── javaconcepts
    │               └── app
    │                   ├── Intro.java
    │                   └── PrintDisplay.java
    └── test
        └── java
            └── com
                └── javaconcepts
                    └── app
                        └── AppTest.java

11 directories, 5 files

```
