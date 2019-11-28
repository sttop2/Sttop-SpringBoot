package com.top.sttop.system.model;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;
@Table(name="user")
public class User {

    /**
     *  用户ID
     */
    @Column(name="userId")
    private Integer userId;

    /**
     *  用户名
     */
    @Column(name="userName")
    private String username;

    /**
     *  用户ID
     */
    @Column(name="userId")
    private String password;

    /**
     *  昵称
     */
    @Column(name="nickName")
    private String nickname;

    /**
     *  性别
     */
    @Column(name="sex")
    private Integer sex;

    /**
     *  生日
     */
    @Column(name="birthday")
    private Date birthday;

    /**
     *  是否启用0：启用；1：禁用
     */
    @Column(name="enabled")
    private Integer enabled;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }
}