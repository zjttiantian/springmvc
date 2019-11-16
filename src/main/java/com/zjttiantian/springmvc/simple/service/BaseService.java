package com.zjttiantian.springmvc.simple.service;

import com.zjttiantian.springmvc.simple.mapper.BaseMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface BaseService<T> {

    public T findById(Object id) ;

    public List<T> findAll() ;
}