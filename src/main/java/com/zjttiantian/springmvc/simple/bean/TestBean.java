package com.zjttiantian.springmvc.simple.bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author zjttiantian
 *
 */
public class TestBean extends BaseBean {

    private String value;

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    public String toString(){
        return super.toString()+"";
    }
}
