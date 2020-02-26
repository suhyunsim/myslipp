package net.slipp.myslipp.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {
    private List<User> users = new ArrayList<User>();

    @GetMapping("/form")
    public String form() {
        return "/user/form";
    }

    @PostMapping("/create")
    public String create(User user) {
        System.out.println("user: " + user);
        users.add(user);
        return "redirect:/users/list";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("users", users);
        return "/user/list";
    }

    @GetMapping("/{userId}")
    public String profile(@PathVariable String userId, Model model) {
        model.addAttribute("user", checkUser(userId));
        return "/user/profile";
    }
    private User checkUser(String userId) {
        for (User user : users) {
            if (userId.equals(user.getUserId()))
                return user;
        }
        return null;
    }
}

