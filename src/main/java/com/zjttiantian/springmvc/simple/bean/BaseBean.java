package com.zjttiantian.springmvc.simple.bean;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author zjttiantian
 *
 */
public class BaseBean implements Serializable,Cloneable {
    /*
    * 主键id
    * */
    private Long id;
    /*
    * 创建时间
    * */
    private Date createTime;
    /*
     * 创建者id
        * */
    private Long createUserId;
    /*
    * 更新时间
    * */
    private Date updateTime;
    /*
    * 更新者id
    * */
    private Long updateUserId;
    /*
    * 数据状态
    * 参考CommonStatus中数据状态
    * */
    private Long status;
    /*
    * 描述
    * */
    private String comments;


    private static final long serialVersionUID = 1L;

    public BaseBean(){

    }
    public BaseBean(Long userId){
        setUpdateUserId(userId);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    //非数据库字段，为前端添加占位字符
    private String value;
    /*
        id，name,value,
    */

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Object clone(){
        BaseBean obj = null;
        try{
            obj = (BaseBean) super.clone();
        }catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public void clean(){
        setComments(null);
        setCreateTime(null);
        setUpdateTime(null);
        setCreateUserId(null);
        setStatus(null);
        setUpdateUserId(null);
    }

    public String toString(){
        return "id="+getId()+",createUserId="+getCreateUserId()+",createTime="+getCreateTime()
                +",updateUserId="+getUpdateUserId()+",updateTime="+getUpdateTime()
                +",status="+getStatus()+",comments="+getComments();
    }
}
