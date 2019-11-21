package com.top.sttop.system.pojo;

/**
 * @author sttop2
 * @date 2019/11/20 16:19
 */

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;
/**
 * 系统用户实体类
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "user")
public class UserPo {

    /**
     * 用户ID
     */
    @Column(name = "userId")
    private Long userId;

    /**
     * 用户名
     */
    @Column(name = "userName")
    private String userName;

    /**
     * 密码
     */
    @Column(name = "passWord")
    private String passWord;

    /**
     * 昵称
     */
    @Column(name = "nickName")
    private String nickName;

    /**
     * 生日
     */
    @Column(name = "birthday")
    private Date birthday;

    /**
     * 性别
     */
    @Column(name = "sex")
    private Integer sex;

    /**
     * 是否启用 0:启用 1:禁用
     */
    @Column(name = "enabled")
    private Integer enabled;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}
