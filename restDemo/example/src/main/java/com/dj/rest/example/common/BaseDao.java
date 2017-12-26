package com.dj.rest.example.common;


import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;


public interface BaseDao<T> {


    Integer insert(T entity);


    Integer deleteById(Serializable id);


    Integer updateById(@Param("entity") T entity);


    T selectById(Serializable id);


    List<T> selectList(@Param("entity") T entity);


    List<T> selectPage(@Param("entity") T entity, @Param("pager") Pager<T> pager);


    Integer selectCount(@Param("entity") T entity);
}
