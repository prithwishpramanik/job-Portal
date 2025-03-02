package com.jobapp.jobApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jobController {

    @RequestMapping({"/","home"})
    public String home(){
        return "home";
    }


    @RequestMapping("addjob")
    public String addjob(){
        return "addjob";
    }

    @RequestMapping("viewalljobs")
    public String viewjob(){
        return "viewalljobs";
    }
}
