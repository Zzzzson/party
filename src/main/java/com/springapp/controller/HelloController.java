package com.springapp.controller;

import com.springapp.domain.Function;
import com.springapp.domain.User;
import com.springapp.service.FunctionService;
import com.springapp.service.UserService;
import org.omg.CORBA._PolicyStub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.sound.midi.Soundbank;

@Controller
@RequestMapping("/")
public class HelloController {
    private static final String LOGIN_IN = "WELCOME";

    public static final String LOGIN_FAIL = "the account is't exist";

    public static final String CURR_USER = "curr";

    @Autowired
    private UserService userService;

    @Autowired
    private FunctionService functionService;

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "login";
    }

    @RequestMapping(value = "signPage.do",method = RequestMethod.GET)
    public String signPage(){
        return "sign";
    }
    @RequestMapping(value = "login.do", method = RequestMethod.GET)
    public String login(@RequestParam String name, @RequestParam String password, ModelMap model,HttpServletRequest request) {
        User u = userService.login(name);
        if (u != null && u.getPassword().equals(password)) {
            request.getSession().setAttribute("curr",u);
            model.addAttribute("list", functionService.getAll());
            return "function";
        }else{
            model.addAttribute("message", LOGIN_FAIL);
            return "hello";
        }
    }

    @RequestMapping(value = "join.do",method = RequestMethod.POST)
    public String join(@RequestParam String id,HttpServletRequest request,ModelMap model){
        System.out.println("id:" + id);
        functionService.join((User) request.getSession().getAttribute("CURR_USER"),Integer.parseInt(id));
        model.addAttribute("list", functionService.getAll());
        return "function";
    }

    @RequestMapping(value = "sign.do", method = RequestMethod.POST)
    public String sign(@RequestParam String name, @RequestParam String password, ModelMap model) {
        User user = new User();
        user.setSex(1);
        user.setName(name);
        user.setPassword(password);
        userService.insertUser(user);
        model.addAttribute("message",LOGIN_IN);
        return "hello";
    }

}