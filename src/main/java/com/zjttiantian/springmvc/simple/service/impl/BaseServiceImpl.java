package com.zjttiantian.springmvc.simple.service.impl;

import com.zjttiantian.springmvc.simple.mapper.BaseMapper;
import com.zjttiantian.springmvc.simple.service.BaseService;

import java.util.List;

public abstract class BaseServiceImpl<T> implements BaseService<T> {

    public abstract BaseMapper getMapper();

    public T findById(Object id) {
        return (T)getMapper().selectByPrimaryKey(id);
    }

    public List<T> findAll() {
        return getMapper().selectAll();
    }
}