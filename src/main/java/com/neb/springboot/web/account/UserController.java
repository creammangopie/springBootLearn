package com.neb.springboot.web.account;


import com.neb.springboot.domain.account.User;
import com.neb.springboot.service.account.UserService;
import com.neb.springboot.service.account.param.query.QueryUserReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author niueb
 * @since 2020-01-20
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/queryUser")
    public String queryUserInfoById(QueryUserReq req){
        User user = userService.queryUserInfoById(req.getId());
        return user.toString();
    }
}

