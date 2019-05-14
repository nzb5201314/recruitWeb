/**
 * Copyright (C), 2019
 * FileName: Payment
 * Author:   nzb
 * Date:     2019/5/14 21:05
 * History:
 * nzb              <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model.tool;

import java.io.Serializable;

/**
 * 〈支付方式表〉〈〉
 *
 * @author nzb
 * @create 2019/5/14
 * @since 1.0.0
 */
public class Payment implements Serializable {

    private static final long serialVersionUID = 2203097371303913053L;

    private Integer id;

    private Integer listorder;

    private String typename;

    private String byname;

    private String p_introduction;

    private String notes;

    private String partnerid;

    private String ytauthkey;

    private String fee;

    private String parameter1;

    private String parameter2;

    private String parameter3;

    private Integer p_install;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getListorder() {
        return listorder;
    }

    public void setListorder(Integer listorder) {
        this.listorder = listorder;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getByname() {
        return byname;
    }

    public void setByname(String byname) {
        this.byname = byname;
    }

    public String getP_introduction() {
        return p_introduction;
    }

    public void setP_introduction(String p_introduction) {
        this.p_introduction = p_introduction;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid;
    }

    public String getYtauthkey() {
        return ytauthkey;
    }

    public void setYtauthkey(String ytauthkey) {
        this.ytauthkey = ytauthkey;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getParameter1() {
        return parameter1;
    }

    public void setParameter1(String parameter1) {
        this.parameter1 = parameter1;
    }

    public String getParameter2() {
        return parameter2;
    }

    public void setParameter2(String parameter2) {
        this.parameter2 = parameter2;
    }

    public String getParameter3() {
        return parameter3;
    }

    public void setParameter3(String parameter3) {
        this.parameter3 = parameter3;
    }

    public Integer getP_install() {
        return p_install;
    }

    public void setP_install(Integer p_install) {
        this.p_install = p_install;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", listorder=" + listorder +
                ", typename='" + typename + '\'' +
                ", byname='" + byname + '\'' +
                ", p_introduction='" + p_introduction + '\'' +
                ", notes='" + notes + '\'' +
                ", partnerid='" + partnerid + '\'' +
                ", ytauthkey='" + ytauthkey + '\'' +
                ", fee='" + fee + '\'' +
                ", parameter1='" + parameter1 + '\'' +
                ", parameter2='" + parameter2 + '\'' +
                ", parameter3='" + parameter3 + '\'' +
                ", p_install=" + p_install +
                '}';
    }
}
