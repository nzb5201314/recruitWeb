/**
 * Copyright (C), 2019-2019,
 * FileName: MembersBean
 * Author:   xwy
 * Date:     2019/5/15 15:22
 * History:
 * xwy          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model.personal;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author Administrator
 * @create 2019/5/15
 * @since 1.0.0
 */
public class MembersBean extends PageBean{
    private Integer uid; //会员id
    private String username; //账户名称
    private String email; //电子邮箱
    private String mobile; //移动电话
    private String reg_time; //注册时间
    private String last_login_time; //最后登录时间

    private Integer rtime; //注册时间分段（条查）1三天内，2一周内，3一月内，4半年内，5一年内


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getReg_time() {
        return reg_time;
    }

    public void setReg_time(String reg_time) {
        this.reg_time = reg_time;
    }

    public String getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(String last_login_time) {
        this.last_login_time = last_login_time;
    }

    public Integer getRtime() {
        return rtime;
    }

    public void setRtime(Integer rtime) {
        this.rtime = rtime;
    }

    @Override
    public String toString() {
        return "MembersBean{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", reg_time='" + reg_time + '\'' +
                ", last_login_time='" + last_login_time + '\'' +
                ", rtime=" + rtime +
                '}';
    }
}

