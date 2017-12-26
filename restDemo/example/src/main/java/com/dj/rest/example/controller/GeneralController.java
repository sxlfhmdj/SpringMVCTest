package com.dj.rest.example.controller;

import com.dj.rest.example.dao.bean.DictionaryBean;
import com.dj.rest.example.dao.iface.DictionaryDao;
import com.dj.rest.example.dto.DemoDto;
import com.dj.rest.example.service.dictionary.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
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
@RequestMapping("/general")
public class GeneralController {

    @Autowired
    private DictionaryService dictionaryService;

    @RequestMapping(value = "/toIndex", method = RequestMethod.GET)
    public String toIndex(Model model){
        DemoDto demoDto = new DemoDto();
        model.addAttribute("demoDto", demoDto);
        return "index";

    }

    @ResponseBody
    @RequestMapping(value = "/getDemo", method = RequestMethod.GET)
    public Map<String, Object> getDemo(){
        DemoDto demoDto = new DemoDto();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("demoDto", demoDto);
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/getDics", method = RequestMethod.GET)
    public Map<String, Object> getDics(){
        List<DictionaryBean> lists =  dictionaryService.selectList(null);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("dics", lists);
        return map;
    }
}