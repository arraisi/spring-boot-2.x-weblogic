package com.itsarraisi.boot.demo.weblogic;

import com.itsarraisi.boot.demo.weblogic.dao.CustomerDao;
import com.itsarraisi.boot.demo.weblogic.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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