package com.dj.rest.example.service.dictionary;

import com.dj.rest.example.dao.bean.DictionaryBean;

import java.util.List;

/**
 * <p>Description: [描述]</p>
 * Copyright (c) 2017 北京柯莱特科技有限公司
 * Created on: 2017/12/26
 *
 * @author <a href="mailto: dengjiang@camelotchina.com">邓江</a>
 * @version 1.0
 */
public interface DictionaryService {

    List<DictionaryBean> selectList(DictionaryBean entity);
}
