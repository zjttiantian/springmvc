package com.zjttiantian.springmvc.simple.controller;

import com.zjttiantian.springmvc.simple.bean.TestBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController extends BaseController{
    private final static Logger log=LoggerFactory.getLogger(TestController.class);

    @RequestMapping(value = "/one",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public TestBean test(@RequestParam(value = "id",required = false,defaultValue = "")String id){
        return testService.findById(Long.valueOf(id));
    }

    @RequestMapping(value = "/all",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<TestBean> test(){
        return testService.findAll();
    }

}
