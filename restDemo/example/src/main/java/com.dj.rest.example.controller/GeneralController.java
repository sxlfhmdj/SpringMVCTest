package com.dj.rest.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>Description: [控制层]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on: 2017/12/25
 *
 * @author <a href="mailto: dengjiang@camelotchina.com">邓江</a>
 * @version 1.0
 */
@Controller
public class GeneralController {

    @RequestMapping(value = "/getdate", method = RequestMethod.GET)

    @ResponseBody
    public Map<String, Object> getDate(HttpServletResponse response) throws IOException {
        SimpleDateFormat tempDate = new SimpleDateFormat("yyyy-MM-dd");
        String datetime = tempDate.format(new java.util.Date());
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("data", datetime);
        return map;
    }
}