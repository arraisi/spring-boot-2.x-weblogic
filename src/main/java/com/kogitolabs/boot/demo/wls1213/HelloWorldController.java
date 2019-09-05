package com.kogitolabs.boot.demo.wls1213;

import com.kogitolabs.boot.demo.wls1213.dao.CustomerDao;
import com.kogitolabs.boot.demo.wls1213.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class HelloWorldController {

    @Autowired
    CustomerDao dao;

    @RequestMapping(method = RequestMethod.GET, value = "/resource")
    String readResource(Model model, @ModelAttribute Customer customer) {
        model.addAttribute("customer", customer);
        Iterable<Customer> all = dao.findAll();
        model.addAttribute("listCustomer", all);
        return "index";
    }
}