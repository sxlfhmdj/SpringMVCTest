package com.dj.rest.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>Description: [描述]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on: 2017/12/25
 *
 * @author <a href="mailto: dengjiang@camelotchina.com">邓江</a>
 * @version 1.0
 */
@Controller
public class GeneralController {

    @RequestMapping(value = "index.do")
    public void index_jsp(Model model) {
        model.addAttribute("hello", "Hi,SpringMVC");
        System.out.println("index.jsp");
    }
}