package com.dj.rest.example.service.dictionary.impl;

import com.dj.rest.example.dao.bean.DictionaryBean;
import com.dj.rest.example.dao.iface.DictionaryDao;
import com.dj.rest.example.service.dictionary.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>Description: [描述]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on: 2017/12/26
 *
 * @author <a href="mailto: dengjiang@camelotchina.com">邓江</a>
 * @version 1.0
 */
@Service("dictionary")
public class DictionaryServiceImpl implements DictionaryService{

    @Autowired
    private DictionaryDao dictionaryDao;

    public List<DictionaryBean> selectList(DictionaryBean entity) {
        List<DictionaryBean> resultList = dictionaryDao.selectList(entity);
        return resultList;
    }

}
