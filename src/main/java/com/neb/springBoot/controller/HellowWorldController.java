package com.neb.springBoot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright: Copyright (c) 2019  zteits
 *
 * @ClassName: HellowWorldController
 * @Description:
 * @version: v1.0.0
 * @author: niueb
 * @date: 2019/12/30 14:30
 * Modification History:
 * Date             Author          Version            Description
 * ---------------------------------------------------------*
 * 2019/12/30       niueb           v1.0.0               创建
 */
@RestController
public class HellowWorldController {
    @RequestMapping("/hello")
    public String index(){
        return "Hello World!";
    }
}
