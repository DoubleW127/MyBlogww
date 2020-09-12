package com.doublew.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {


    @GetMapping("/")
    public String index(){
        //int a  = 1/0;
        String blog = null;
        /*if(blog == null){
            throw new NotFoundException("博客不存在");
        }*/
        return "index";
    }

}
