package com.dj.rest.example.controller;

import com.dj.rest.example.common.AjaxInfo;
import com.dj.rest.example.dao.bean.DictionaryBean;
import com.dj.rest.example.dto.DemoDto;
import com.dj.rest.example.service.dictionary.DictionaryService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
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
    public String toIndex(Model model) {
        DemoDto demoDto = new DemoDto();
        model.addAttribute("demoDto", demoDto);
        return "index";

    }

    @ResponseBody
    @RequestMapping(value = "/getDemo", method = RequestMethod.GET)
    public AjaxInfo getDemo() {
        DemoDto demoDto = new DemoDto();
        return AjaxInfo.requestSuccess().setData(demoDto);
    }

    @ResponseBody
    @RequestMapping(value = "/getDics", method = RequestMethod.GET)
    public AjaxInfo getDics() {
        try {
            List<DictionaryBean> lists = dictionaryService.selectList(null);
            return AjaxInfo.requestSuccess().setData(lists);
        } catch (Exception e) {
            logger.error("查询字典失败");
        }
        return AjaxInfo.requestFail().setMsg("查询字典失败");
    }

//    @RequestMapping("download")
//    public void download(HttpServletRequest request, HttpServletResponse response) {
//        byte[] buff = new byte[1024];
//        BufferedInputStream bis = null;
//        OutputStream os = null;
//        //分页查询
//        Pager<DictionaryBean> pager = new Pager<DictionaryBean>();
//        pager = dictionaryService.selectPage(null, pager);
//
//        try {
//            os = response.getOutputStream();
//            bis = new BufferedInputStream(new FileInputStream());
//            int i = bis.read(buff);
//            while (i != -1) {
//                os.write(buff, 0, buff.length);
//                os.flush();
//                i = bis.read(buff);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (bis != null) {
//                try {
//                    bis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
}