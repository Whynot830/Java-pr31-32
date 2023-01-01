package com.springbootapp.java_pr31_32.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/greeting")
    public String greeting() {
        return "<div " +
                "style='margin: auto;" +
                "padding: 1rem;" +
                "color: white;" +
                "font: message-box;" +
                "font-size: 2rem;" +
                "background-color: #888;" +
                "width: fit-content;" +
                "border-radius: 1rem'>" +
                "Welcome!</div>";
    }
}
