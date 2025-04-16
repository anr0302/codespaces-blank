package com.example.demo01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo01Controller {
    @RequestMapping("/")
    String index(){
        return "index";//to edit index.html and return it 
    }

}
