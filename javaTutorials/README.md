# My Java Tutorials
* Create Project: ***Preferred Approach for command line use***
```
mvn archetype:generate -DgroupId=com.javatutorials -DartifactId=javatutorials -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```
**NOTE:** If you need a base scaffolding with more batteries included, use this instead:
```
mvn archetype:generate -DgroupId=com.javatutorials -DartifactId=javatutorials -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```

* Compile and Execute:
```
mvn clean install assembly:single
java -jar target/javaconcepts-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## Code Structure
```
├── pom.xml
├── README.md
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── javatutorials
    │               └── App.java
    └── test
        └── java
            └── com
                └── javatutorials
                    └── AppTest.java

11 directories, 5 files
```

## Maven Container Layout
Depending on your archtype, you should have something like this
| Item                 | Default                        |
| ---------------------| ------------------------------ |
| Source Code          | ${basedir}/src/main/java       |
| Resources            | ${basedir}/src/main/resources  |
| Tests                | ${basedir}/src/test            |
| Complied byte code   | ${basedir}/target              |
| Distributable JAR    | ${basedir}/target/classes      |
