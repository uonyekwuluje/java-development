# Create Project
```
mvn archetype:generate -DgroupId=com.dbapp -DartifactId=dbapp -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

# Build, Run and Execute
```
mvn clean install assembly:single
java -jar target/dbapp-1.0-SNAPSHOT-jar-with-dependencies.jar
```
