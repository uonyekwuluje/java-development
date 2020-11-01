# My Java Development Environment

## Install Java
```
cd /opt
sudo wget https://download.java.net/java/GA/jdk14/076bab302c7b4508975440c56f6cc26a/36/GPL/openjdk-14_linux-x64_bin.tar.gz
sudo tar -zxvf openjdk-14_linux-x64_bin.tar.gz
sudo rm openjdk-14_linux-x64_bin.tar.gz
/opt/jdk-14/bin/java -version
```

## Install Maven
```
MAVENVERSION="3.6.3"
cd /opt
sudo wget https://www-us.apache.org/dist/maven/maven-3/${MAVENVERSION}/binaries/apache-maven-${MAVENVERSION}-bin.tar.gz
sudo tar -zxvf apache-maven-${MAVENVERSION}-bin.tar.gz
sudo rm -Rf /opt/apache-maven
sudo mv /opt/apache-maven-${MAVENVERSION} /opt/apache-maven
sudo rm /opt/apache-maven-${MAVENVERSION}-bin.tar.gz
/opt/apache-maven/bin/mvn --version
```

## Update Profile
```
export JAVA_HOME="/opt/jdk-14"
export M2_HOME="/opt/apache-maven"
export MAVEN_HOME="/opt/apache-maven"
export PATH=$JAVA_HOME/bin:$PATH
export PATH=${M2_HOME}/bin:${PATH}
```
