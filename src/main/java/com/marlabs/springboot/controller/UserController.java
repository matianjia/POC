package com.marlabs.springboot.controller;

import com.marlabs.springboot.entities.User;
import com.marlabs.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/users")
    public String list(Map<String, Object> map, User user) {
        List<User> users = userMapper.getUsers(user);
        map.put("users", users);
        map.put("username", user.getUsername());
        return "user/list";
    }

    @GetMapping("/user/pwd")
    public String toUpdatePwdPage() {

        return "main/password";

    }



    @GetMapping("/user/{id}")
    public String view(@PathVariable("id") Integer id,
                       @RequestParam(value = "type", defaultValue = "view") String type,
                       Map<String, Object> map) {

        User user = userMapper.getUserById(id);
        map.put("user", user);
// type = null link to view.html， type=update link to update.html
        return "user/" + type;
    }

    @PutMapping("/user")
    public String update(User user) {
        userMapper.updateUser(user);
        return "redirect:users";
    }

    @GetMapping("/user")
    public String toAddPage() {
        return "user/add";
    }

    @PostMapping("/user")
    public String add(User user) {
        userMapper.addUser(user);
        return "redirect:/users";
    }

    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable("id") Integer id) {
        userMapper.deleteUserById(id);
        return "redirect:/users";
    }

    @ResponseBody
    @GetMapping("/user/pwd/{oldPwd}")
    public Boolean checkPwd(HttpSession session, @PathVariable("oldPwd") String oldPwd) {
        User user = (User) session.getAttribute("loginUser");
        if (user.getPassword().equals(oldPwd)) {
            return true;
        }

        return false;
    }

    @PostMapping("/user/Pwd")
    public String updatePwd(HttpSession session,String  password) {
        User user = (User) session.getAttribute("loginUser");
        user.setPassword(password);
        userMapper.updateUser(user);
        return "redirect/logout";
    }


}
