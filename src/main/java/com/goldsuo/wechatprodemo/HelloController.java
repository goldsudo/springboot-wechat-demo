package com.goldsuo.wechatprodemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/hello")
public class HelloController {
    @RequestMapping(value="/sayHi",method = RequestMethod.GET)
    public String sayHi() {
        return "Hello Sping boot";
    }
}
