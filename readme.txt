The project has been made with spring boot 1.3 and maven.
To run the app just execute the goal "spring-boot:run".
There is an application.properties inside the project with the default configuration in resources
but if a jar is generated and you create another application.properties and put it aside the generated jar,
it should take the new configuration as default.


*The default configuration should create the database automatically.