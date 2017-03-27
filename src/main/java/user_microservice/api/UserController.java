package user_microservice.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ruaoneill on 23/03/2017.
 */

@SpringBootApplication
@RestController
public class UserController {

    @RequestMapping("/")
    public String home() {
        return "Hello Microservice World";
    }

}
