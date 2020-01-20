package com.neb.springboot.service.account.dto;
import java.util.Date;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author niueb
 * @since 2020-01-20
 */

public class UserDTO {

    private static final long serialVersionUID=1L;

      /**
     * 主键
     */
  

    private Long id;

      /**
     * 客户id
     */
  

    private String custId;

      /**
     * 客户名称
     */
  

    private String custName;

      /**
     * 昵称
     */
  

    private String custNickname;

      /**
     * 登陆 用户名
     */
  

    private String userName;

      /**
     * 登陆 密码
     */
  

    private String userPassword;

      /**
     * 用户手机号码
     */
  

    private String userPhone;

      /**
     * 性别 1:男，2:女,3:未知
     */
  

    private Integer sex;

      /**
     * 邮箱
     */
  

    private String email;

      /**
     * 客户类型 目前只有 1：个人客户
     */
  

    private Integer custType;

      /**
     * 证件类型
     */
  

    private Integer cerType;

      /**
     * 证件号码
     */
  

    private String cerNumber;

      /**
     * 详细地址
     */
  

    private String address;

      /**
     * 头像地址
     */
  

    private String headPicUrl;

      /**
     * 出生日期
     */
  

    private Date birthDate;

      /**
     * 描述
     */
  

    private String remark;

      /**
     * 数据状态：1有效，0无效
     */
  

    private Integer dataState;

      /**
     * 创建人
     */
  

    private String createEmpid;

      /**
     * 创建时间
     */
  

    private Date createDate;

      /**
     * 修改人
     */
  

    private String modfiyEmpid;

      /**
     * 修改时间
     */
  

    private Date modfiyDate;

      /**
     * 账户冻结状态，0-正常，1-冻结
     */
  

    private Integer freezeState;

      /**
     * 冻结时间
     */
  

    private Date freezeDate;

    
    public Long getId() {
        return id;
    }

      public void setId(Long id) {
          this.id = id;
      }
    
    public String getCustId() {
        return custId;
    }

      public void setCustId(String custId) {
          this.custId = custId;
      }
    
    public String getCustName() {
        return custName;
    }

      public void setCustName(String custName) {
          this.custName = custName;
      }
    
    public String getCustNickname() {
        return custNickname;
    }

      public void setCustNickname(String custNickname) {
          this.custNickname = custNickname;
      }
    
    public String getUserName() {
        return userName;
    }

      public void setUserName(String userName) {
          this.userName = userName;
      }
    
    public String getUserPassword() {
        return userPassword;
    }

      public void setUserPassword(String userPassword) {
          this.userPassword = userPassword;
      }
    
    public String getUserPhone() {
        return userPhone;
    }

      public void setUserPhone(String userPhone) {
          this.userPhone = userPhone;
      }
    
    public Integer getSex() {
        return sex;
    }

      public void setSex(Integer sex) {
          this.sex = sex;
      }
    
    public String getEmail() {
        return email;
    }

      public void setEmail(String email) {
          this.email = email;
      }
    
    public Integer getCustType() {
        return custType;
    }

      public void setCustType(Integer custType) {
          this.custType = custType;
      }
    
    public Integer getCerType() {
        return cerType;
    }

      public void setCerType(Integer cerType) {
          this.cerType = cerType;
      }
    
    public String getCerNumber() {
        return cerNumber;
    }

      public void setCerNumber(String cerNumber) {
          this.cerNumber = cerNumber;
      }
    
    public String getAddress() {
        return address;
    }

      public void setAddress(String address) {
          this.address = address;
      }
    
    public String getHeadPicUrl() {
        return headPicUrl;
    }

      public void setHeadPicUrl(String headPicUrl) {
          this.headPicUrl = headPicUrl;
      }
    
    public Date getBirthDate() {
        return birthDate;
    }

      public void setBirthDate(Date birthDate) {
          this.birthDate = birthDate;
      }
    
    public String getRemark() {
        return remark;
    }

      public void setRemark(String remark) {
          this.remark = remark;
      }
    
    public Integer getDataState() {
        return dataState;
    }

      public void setDataState(Integer dataState) {
          this.dataState = dataState;
      }
    
    public String getCreateEmpid() {
        return createEmpid;
    }

      public void setCreateEmpid(String createEmpid) {
          this.createEmpid = createEmpid;
      }
    
    public Date getCreateDate() {
        return createDate;
    }

      public void setCreateDate(Date createDate) {
          this.createDate = createDate;
      }
    
    public String getModfiyEmpid() {
        return modfiyEmpid;
    }

      public void setModfiyEmpid(String modfiyEmpid) {
          this.modfiyEmpid = modfiyEmpid;
      }
    
    public Date getModfiyDate() {
        return modfiyDate;
    }

      public void setModfiyDate(Date modfiyDate) {
          this.modfiyDate = modfiyDate;
      }
    
    public Integer getFreezeState() {
        return freezeState;
    }

      public void setFreezeState(Integer freezeState) {
          this.freezeState = freezeState;
      }
    
    public Date getFreezeDate() {
        return freezeDate;
    }

      public void setFreezeDate(Date freezeDate) {
          this.freezeDate = freezeDate;
      }

    @Override
    public String toString() {
        return "UserDTO{" +
              "id=" + id +
                  ", custId=" + custId +
                  ", custName=" + custName +
                  ", custNickname=" + custNickname +
                  ", userName=" + userName +
                  ", userPassword=" + userPassword +
                  ", userPhone=" + userPhone +
                  ", sex=" + sex +
                  ", email=" + email +
                  ", custType=" + custType +
                  ", cerType=" + cerType +
                  ", cerNumber=" + cerNumber +
                  ", address=" + address +
                  ", headPicUrl=" + headPicUrl +
                  ", birthDate=" + birthDate +
                  ", remark=" + remark +
                  ", dataState=" + dataState +
                  ", createEmpid=" + createEmpid +
                  ", createDate=" + createDate +
                  ", modfiyEmpid=" + modfiyEmpid +
                  ", modfiyDate=" + modfiyDate +
                  ", freezeState=" + freezeState +
                  ", freezeDate=" + freezeDate +
              "}";
    }
}
