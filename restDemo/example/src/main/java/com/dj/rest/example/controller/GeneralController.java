package com.dj.rest.example.controller;

import com.dj.rest.example.common.AjaxInfo;
import com.dj.rest.example.dao.bean.DictionaryBean;
import com.dj.rest.example.dto.DemoDto;
import com.dj.rest.example.service.dictionary.DictionaryService;
import org.apache.log4j.spi.LoggerFactory;
import org.slf4j.Logger;
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

    protected final Logger logger = org.slf4j.LoggerFactory.getLogger(getClass());

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
    public AjaxInfo getDemo(){
        DemoDto demoDto = new DemoDto();
        return AjaxInfo.requestSuccess().setData(demoDto);
    }

    @ResponseBody
    @RequestMapping(value = "/getDics", method = RequestMethod.GET)
    public AjaxInfo getDics(){
        try{
            List<DictionaryBean> lists =  dictionaryService.selectList(null);
            return AjaxInfo.requestSuccess().setData(lists);
        }catch (Exception e){
            logger.error("查询字典失败");
        }
        return AjaxInfo.requestFail().setMsg("查询字典失败");
    }
}