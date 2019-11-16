package com.zjttiantian.springmvc.simple.service;

import com.zjttiantian.springmvc.simple.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class BaseService<T> {

    public abstract BaseMapper getMapper();

    public T findById(Object id) {
        return (T)getMapper().selectByPrimaryKey(id);
    }

    public List<T> findAll() {
        return getMapper().selectAll();
    }
}