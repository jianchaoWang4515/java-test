package com.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/id",method = RequestMethod.GET)
    public lwModel get(String id) {
        lwModel lw =new lwModel();
        lw.setName(id);
        lw.setValue("lw");
        lw.setAgr(18);
        return lw;
    }
}
