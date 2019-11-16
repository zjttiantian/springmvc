package com.zjttiantian.springmvc.simple.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaseMapper<T> {
    public T selectByPrimaryKey(Object t);
    public List<T> selectAll();
    public Integer insertSelective(T t);
    public void updateByPrimaryKeySelective(T t);
    public void deleteByPrimaryKey(Object t);
    public void updateStatus(@Param("id") Object id, @Param("userId") Object userId, @Param("status") Object status);
    public Integer count();

}
