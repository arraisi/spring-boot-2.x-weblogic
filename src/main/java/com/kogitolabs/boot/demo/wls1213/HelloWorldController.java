package com.kogitolabs.boot.demo.wls1213;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, value = "/resource")
    String readResource(Model model) {
        return "index";
    }
}