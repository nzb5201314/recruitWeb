/**
 * Copyright (C), 2019, 金科教育
 * FileName: MemberBean
 * Author:   mrq
 * Date:     2019/5/16 11:04
 * Description: member
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名：mrq        修改时间           版本号              描述
 */
package com.jk.model.member;

import com.jk.pagerows.PageRows;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈member〉
 *
 * @author Administrator
 * @create 2019/5/16
 * @since 1.0.0
 */
public class MemberBean extends PageRows implements Serializable {

    private static final long serialVersionUID = -3345503019617170929L;
    private Integer uid;            //会员id
    private String username;        //用户名
    private String companyname;     //企业名
    private String telephone;       //手机
    private String email;           //邮箱
    private Date reg_times;         //注册时间
    private Integer status;         //微信绑定状态
    private Integer last_login_time;
    private Integer reg_time;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getReg_time() {
        return reg_time;
    }

    public void setReg_time(Integer reg_time) {
        this.reg_time = reg_time;
    }

    public Date getReg_times() {
        return reg_times;
    }

    public void setReg_times(Date reg_times) {
        this.reg_times = reg_times;
    }

    public Integer getLast_login_time() {
        return last_login_time;
    }

    public void setLast_login_time(Integer last_login_time) {
        this.last_login_time = last_login_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "MemberBean{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", company='" + companyname + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", reg_time=" + reg_time +
                ", reg_times=" + reg_times +
                ", last_login_time=" + last_login_time +
                ", status=" + status +
                '}';
    }
}
 
