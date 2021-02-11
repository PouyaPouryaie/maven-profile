package ir.bigz.microservice.mavenprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * mvn -P"profile-id" -> select the profile at build and package stage
 * mvn help:active-profiles -> show active-profile
 * use <activeByDefault>true</activeByDefault> in pom file, for maven knowing which profile is default
 * for run default properties you can add spring.profiles.active="active-profile" in application.properties
 * or use -> java -jar -Dspring.profiles.active=integration ./target/maven-profile-1.0.0.jar when start the app
 */
@SpringBootApplication
public class MavenProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(MavenProfileApplication.class, args);
	}

}
