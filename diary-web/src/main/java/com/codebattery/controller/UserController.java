package com.codebattery.controller;

import com.codebattery.model.User;
import com.codebattery.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/7/25.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/hello")
    public ModelAndView hello(HttpServletRequest request, HttpServletResponse response) {
        ModelAndView mav = new ModelAndView("user");
        User user = userService.getUserById(1);
        mav.addObject("userName", user.getName());
        return mav;
    }
}
