package com.zebra.box.controller.help;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.zebra.box.db.service.Help;

/**
 * 加入我们模块
 * 
 * @author 毛巳煜
 */
@Controller
@RequestMapping("/helpController")
public class HelpController {

    @Autowired
    private Help helpImpl;

    @RequestMapping("/initHelp")
    public String initHelp() {

        return "help";
    }

    @RequestMapping("/insertHelp")
    public String insertHelp(@RequestParam MultipartFile[] fileName) {

        System.out.println(fileName);
        helpImpl.insertHelp(fileName);
        return "help";
    }

}
