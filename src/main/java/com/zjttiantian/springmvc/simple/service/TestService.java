package com.zjttiantian.springmvc.simple.service;

import com.zjttiantian.springmvc.simple.bean.TestBean;
import com.zjttiantian.springmvc.simple.mapper.BaseMapper;
import com.zjttiantian.springmvc.simple.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface TestService extends BaseService<TestBean> {
}