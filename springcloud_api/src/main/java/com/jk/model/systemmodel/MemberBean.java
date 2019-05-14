/**
 * Copyright (C), 2019,金科
 * FileName: MemberBean
 * Author:   HT
 * Date:     2019/5/14 16:21
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
 * @create 2019/5/14
 * @since 1.0.0
 */
public class MemberBean implements Serializable {
    private static final long serialVersionUID = -6062052149229159583L;

    private Integer id;

    private Integer closereg;   //关闭注册  0=关闭 1=开启

    private Integer registerpasswordopen;   //注册是否开启密码输入  0=关闭 1=开启

    private String regprefix;   //手机注册用户名前缀

    private String emailregprefix;  //邮箱注册用户名前缀

    private Integer regpasswordtpye;//快速注册生成密码 1=与用户名相同 2=随机密码 3=指定密码

    private String regpasswordtpyeinput; //指定密码

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClosereg() {
        return closereg;
    }

    public void setClosereg(Integer closereg) {
        this.closereg = closereg;
    }

    public Integer getRegisterpasswordopen() {
        return registerpasswordopen;
    }

    public void setRegisterpasswordopen(Integer registerpasswordopen) {
        this.registerpasswordopen = registerpasswordopen;
    }

    public String getRegprefix() {
        return regprefix;
    }

    public void setRegprefix(String regprefix) {
        this.regprefix = regprefix;
    }

    public String getEmailregprefix() {
        return emailregprefix;
    }

    public void setEmailregprefix(String emailregprefix) {
        this.emailregprefix = emailregprefix;
    }

    public Integer getRegpasswordtpye() {
        return regpasswordtpye;
    }

    public void setRegpasswordtpye(Integer regpasswordtpye) {
        this.regpasswordtpye = regpasswordtpye;
    }

    public String getRegpasswordtpyeinput() {
        return regpasswordtpyeinput;
    }

    public void setRegpasswordtpyeinput(String regpasswordtpyeinput) {
        this.regpasswordtpyeinput = regpasswordtpyeinput;
    }

    @Override
    public String toString() {
        return "MemberBean{" +
                "id=" + id +
                ", closereg=" + closereg +
                ", registerpasswordopen=" + registerpasswordopen +
                ", regprefix='" + regprefix + '\'' +
                ", emailregprefix='" + emailregprefix + '\'' +
                ", regpasswordtpye=" + regpasswordtpye +
                ", regpasswordtpyeinput='" + regpasswordtpyeinput + '\'' +
                '}';
    }
}

