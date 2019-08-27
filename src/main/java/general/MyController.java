package general;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class MyController {

    public MyController(){
        System.out.println("==================");
        System.out.println("==================");
        System.out.println("==================");
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(){
        return "HELLO WORLD FROM MVC";
    }
}
