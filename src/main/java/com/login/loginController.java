package com.login;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")

public class loginController {

    @RequestMapping(value = { "" }, method = RequestMethod.POST)
    public resModel submit(String account, String password) {
        resModel resJson = new resModel();
        if (account.equals("0101917") && password.equals("123456")) {
            resJson.success("登录成功");
        } else {
            resJson.error("登录失败");
        }
        return resJson;
    }
}
