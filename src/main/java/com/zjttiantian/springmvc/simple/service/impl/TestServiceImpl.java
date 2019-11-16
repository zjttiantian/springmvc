package com.zjttiantian.springmvc.simple.service.impl;

import com.zjttiantian.springmvc.simple.bean.TestBean;
import com.zjttiantian.springmvc.simple.mapper.BaseMapper;
import com.zjttiantian.springmvc.simple.mapper.TestMapper;
import com.zjttiantian.springmvc.simple.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl extends BaseServiceImpl<TestBean> implements TestService{
    @Autowired
    private TestMapper mapper;

    @Override
    public BaseMapper getMapper() {
        return mapper;
    }
}