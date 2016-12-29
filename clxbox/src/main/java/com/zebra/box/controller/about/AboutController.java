package com.zebra.box.controller.about;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aboutController")
public class AboutController {

    @RequestMapping("/initAbout")
    public String initAbout() {

        return "about";
    }
}
