package net.slipp.myslipp.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    private List<User> users = new ArrayList<User>();

    @PostMapping("/users")
    public String create(User user) {
        System.out.println("user: " + user);
        users.add(user);
        return "redirect:/users/list";
    }
    @GetMapping("/users/list")
    public String list(Model model) {
        model.addAttribute("users", users);
        return "list";
    }
}
