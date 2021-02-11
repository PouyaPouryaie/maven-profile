package ir.bigz.microservice.mavenprofile;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    ResponseEntity<?> getHello(){
        return new ResponseEntity<>("hello world", HttpStatus.OK);
    }
}
