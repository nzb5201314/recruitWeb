/**
 * Copyright (C), 2019,金科
 * FileName: UserrsdBean
 * Author:   HT
 * Date:     2019/5/15 15:13
 * History:
 * HT          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model.systemmodel;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/15
 * @since 1.0.0
 */
public class UserrsdBean implements Serializable {

    private static final long serialVersionUID = 2692600491122071891L;

    private Integer id;

    private String username;//用户名字

    private String email; //电子邮件

    private String password;//密码

    private String pwd_hash; //Pdd-散列  我也不知道这个是什么玩意 人家表格里有

    private Integer role_id; //头衔id  1==超级管理员  2==普通用户

    private String  add_time;//创建时间

    private String last_login_time;//最后登录时间

    private String last_login_ip;//最后登录的地址id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPwd_hash() {
        return pwd_hash;
    }

    public void setPwd_hash(String pwd_hash) {
        this.pwd_hash = pwd_hash;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getAdd_time() {
        return add_time;
    }

    public void setAdd_time(String add_time) {
        this.add_time = add_time;
    }

    public String getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(String last_login_time) {
        this.last_login_time = last_login_time;
    }

    public String getLast_login_ip() {
        return last_login_ip;
    }

    public void setLast_login_ip(String last_login_ip) {
        this.last_login_ip = last_login_ip;
    }

    @Override
    public String toString() {
        return "UserrsdBean{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", pwd_hash='" + pwd_hash + '\'' +
                ", role_id=" + role_id +
                ", add_time='" + add_time + '\'' +
                ", last_login_time='" + last_login_time + '\'' +
                ", last_login_ip='" + last_login_ip + '\'' +
                '}';
    }
}

