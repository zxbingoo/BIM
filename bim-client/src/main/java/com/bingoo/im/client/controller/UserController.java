package com.bingoo.im.client.controller;

import com.bingoo.im.client.Service.UserService;
import com.bingoo.im.common.BO.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.bingoo.im.common.VO.res.BaseResponse;
import org.springframework.web.bind.annotation.*;

/**
 * @author jianbin
 * @date 2019/11/27
 */
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse Login(@RequestBody UserInfo userInfo){
        return userService.login(userInfo);
    }


}
