package org.nick.demo.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.nick.demo.model.User;
import org.nick.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Nick on 14-8-10.
 */
@Controller
public class UserController {

    private static Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user")User user){
        logger.entry(user);
        userRepository.save(user);
        return logger.exit("hello");
    }

    @RequestMapping(value = "/display", method = RequestMethod.GET)
    public String displayUsers(ModelMap modelMap){
        logger.entry(modelMap);
        modelMap.put("users", userRepository.findAll());
        logger.exit(modelMap);
        return "hello";
    }
}
