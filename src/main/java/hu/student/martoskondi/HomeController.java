package hu.student.martoskondi;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage() {
        return "index";
    }

    @GetMapping("/rules")
    public String getRules() {
        return "rules";
    }


}
