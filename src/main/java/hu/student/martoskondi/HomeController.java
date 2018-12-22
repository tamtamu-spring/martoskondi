package hu.student.martoskondi;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String getHomePage() {
        return "index";
    }

    @GetMapping("/about-us")
    public String getAboutUsPage() {
        return "about-us";
    }

    @GetMapping("/rules")
    public String getRulesPage() {
        return "rules";
    }

    @GetMapping("/training")
    public String getTrainingPage() {
        return "training";
    }

    @GetMapping("/gym")
    public String getGymPage() {
        return "gym";
    }


}
