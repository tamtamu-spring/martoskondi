package hu.student.martoskondi.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String showLoginForm(@RequestParam(value = "error", required = false) String error, Model model) {

        if(error!= null)
            model.addAttribute("loginfailed", "Email address or password is incorrect!");

        return "login";
    }

    @GetMapping("/profile")
    public String getGymPage() {
        return "profile";
    }

}
