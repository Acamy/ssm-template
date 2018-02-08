package com.hebaohua.controller;

import com.hebaohua.entity.User;
import com.hebaohua.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * @author Hebh
 * @date 2018/2/3
 * @description:
 */
@Controller
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user")
    public String getUser(ModelMap map) throws Exception{
        logger.info("日志信息！");

        User user = userService.getUserById(1);
        map.addAttribute("user", user);
        return "user"; // 对应WEB-INF\\freemarker\\user.ftl
    }
}
