package com.neb.springboot.service.account.param.oper;
import java.util.Date;

public class SaveAndModifyUserReq {

/**
 *
 */
private static final long serialVersionUID=1L;

    /**id*/
    private Long id;

    /**创建人*/
    private String createEmpId;

    /**创建人名称*/
    private String createEmpName;

    /**创建时间*/
    private Date createTime;

    /**修改人*/
    private String modifyEmpId;

    /**修改人名称*/
    private String modifyEmpName;

    /**修改时间*/
    private Date modifyTime;

    /**获取创建人*/
    public String getCreateEmpId(){
        return createEmpId;
    }

    /**设置创建人*/
    public void setCreateEmpId(String createEmpId){
        this.createEmpId=createEmpId==null?null:createEmpId.trim();
    }

    /**获取创建人名称*/
    public String getCreateEmpName(){
        return createEmpName;
    }

    /**设置创建人名称*/
    public void setCreateEmpName(String createEmpName){
        this.createEmpName=createEmpName==null?null:createEmpName.trim();
    }

    /**获取创建时间*/
    public Date getCreateTime(){
        return createTime;
    }

    /**设置创建时间*/
    public void setCreateTime(Date createTime){
        this.createTime=createTime;
    }

    /**获取修改人*/
    public String getModifyEmpId(){
        return modifyEmpId;
    }

    /**设置修改人*/
    public void setModifyEmpId(String modifyEmpId){
        this.modifyEmpId=modifyEmpId==null?null:modifyEmpId.trim();
    }

    /**获取修改人名称*/
    public String getModifyEmpName(){
        return modifyEmpName;
    }

    /**设置修改人名称*/
    public void setModifyEmpName(String modifyEmpName){
        this.modifyEmpName=modifyEmpName==null?null:modifyEmpName.trim();
    }

    /**获取修改时间*/
    public Date getModifyTime(){
        return modifyTime;
    }

    /**设置修改时间*/
    public void setModifyTime(Date modifyTime){
        this.modifyTime=modifyTime;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }
}