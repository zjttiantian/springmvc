package com.zjttiantian.springmvc.simple.controller;

import com.zjttiantian.springmvc.simple.TestBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/base")
public class BaseController {
    @Autowired
    protected HttpServletRequest request;
    @Autowired
    protected HttpServletResponse response;
    @Autowired
    protected HttpSession session;

    private final static Logger log=LoggerFactory.getLogger(BaseController.class);
    @ModelAttribute
    public void beforeController(){
        log.info(request.getRequestURI());
    }

    @RequestMapping(value = "/index",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String index(){
        return "OK";
    }

    @RequestMapping(value = "/test1/{id}",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String test1(@PathVariable("id")String id){
        log.info(id);
        return "OK";
    }

    @RequestMapping(value = "/test2",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String test2(@RequestParam(value = "id",required = false,defaultValue = "")String id){
        log.info(id);
        return "OK";
    }

    @RequestMapping(value = "/index",produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String index(@RequestBody TestBean tb){
        log.info("对象==>",tb);
        return "OK";
    }

}
