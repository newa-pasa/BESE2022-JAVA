## Installation
1. Tomcat - https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.18/bin/apache-tomcat-10.1.18.exe
2. Maven - https://dlcdn.apache.org/maven/maven-3/3.9.6/binaries/apache-maven-3.9.6-bin.zip
3. Code Editor - Visual Code Studio 

## Path Setting
1. Crate a new environment variable CATALINA_HOME and save root directory path of tomcat
2. Add path to bin of tomcat in path variable as "%CATALINA_HOME%\bin"
3. Add path to bin of Maven in path variable 
## Tomcat user config 
User role and user setting in `tomcat installatiuon directory\conf\tomcat-users.xml`
```xml 
	<role rolename="admin-gui"/>
	<role rolename="manager-gui"/>
	<user username="tomcat" password="tomcat" roles="manager-gui, admin-gui"/>
```

## Some Extensions for Visual Studio Code
1. Java extension pack 
2. Java dev tools pack
3. Red hat commons
4. Maven
5. Community Server Connector 
## Project Creation
1. `ctrl + shift + p` 
	--> Create Java Project 
	--> Maven create from archetype 
	--> maven-archetype-webapp
	--> 1.4 
	--> Group id e.g np.edu.gcces
	--> Artifact id e.g accounting 
	--> select project folder 
	--> Interactive console will ask for confirmation select default by pressing `enter`
	--> create directory structure as following based on group id and artifact id 
	
```plaintext
	Projet root folder
	├── src
	│   └── main
	│       └── java
	│       |   └── np
	│       |       └── edu
	│       |           └── gces
	│       |               └── accounting
	│       └── webapp
	└── target
		└── MANIFEST.MF
```
