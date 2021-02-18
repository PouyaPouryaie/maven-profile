### Maven Profiles with spring-boot

when you use multiple profiles for develop or product environment, <br > you need define which one of the profiles must be activated. <br />
for this you should be tags activation in profiles section on the pom files. <br >
then define spring.profiles.active in properties tag in profile.after that use below command. <br >

#
```
mvn package -P "active-profile"
java -jar jarfile.jar / mvn spring-boot:run -P "active-profile" 
```  
