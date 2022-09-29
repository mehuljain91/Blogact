package com.project.Blogact.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author mehul jain
 */
@Controller
public class IndexController {                                                 

    @GetMapping("/")
    public String index() {
        return "redirect:/article";
    }
}
