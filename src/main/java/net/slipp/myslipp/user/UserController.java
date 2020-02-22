package net.slipp.myslipp.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/hell")
    public String user(String name, Model model) {
        System.out.println("name: " + name);
        model.addAttribute("name", name);
        return "welcome";
    }
}
