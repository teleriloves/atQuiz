package ATS.atquiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ATS.atquiz.service.User.UserService;

@Controller
public class WebController {
	
	@Autowired
	UserService userService;
   
    @RequestMapping(value={"/","home"})
        public String home(){
            return "home";
        }
  
    @RequestMapping(value="/admin")
    public String admin(Model modelo){
    	modelo.addAttribute("users", userService.findAll());
        return "admin";
    }
    
    @RequestMapping(value={"/candidate"})
    public String student(){
        return "candidate";
    }
   
    @RequestMapping(value={"/login"})
    public String login(){
        return "login";
    }
   
    @RequestMapping(value="/403")
    public String Error403(){
        return "403";
    }
}