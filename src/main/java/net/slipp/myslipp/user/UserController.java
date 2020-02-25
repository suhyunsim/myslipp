package net.slipp.myslipp.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @PostMapping("/users")
    public String create(String userId, String password, String name, String email) {
        System.out.println("userId: "+ userId + " password: " + password + " name: " + name + " email: " + email);
        return "welcome";
    }
}
