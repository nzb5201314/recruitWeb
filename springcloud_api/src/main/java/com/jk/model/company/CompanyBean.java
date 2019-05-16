/**
 * Copyright (C), 2019, 金科教育
 * FileName: CompanyBean
 * Author:   mrq
 * Date:     2019/5/15 14:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名：mrq        修改时间           版本号              描述
 */
package com.jk.model.company;

import com.jk.pagerows.PageRows;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/15
 * @since 1.0.0
 */
public class CompanyBean extends PageRows implements Serializable {

    private static final long serialVersionUID = 8708800969531372088L;
    private Integer id;
    private Integer uid;
    private String companyname;
    private Integer addtime;
    private Integer deadline;   
    private Date addtimes;          //创建时间
    private Date refreshtimes;      //刷新时间
    private Date deadlines;         //到期时间
    private String comtifition;     //企业认证
    private String ontication;      //实地认证
    private String repsition;       //在招职位
    private String short_name;      //公司简称
    private Integer audit;          //审核状态
    private String company_nature;  //公司性质
    private String address;         //公司地址
    private String scales;          //规模
    private String telephone;       //电话
    private String contents;        //网络
    private String company_img;     //公司图片
    private Integer status;         //绑定状态

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getDeadline() {
        return deadline;
    }

    public void setDeadline(Integer deadline) {
        this.deadline = deadline;
    }

    public Date getAddtimes() {
        return addtimes;
    }

    public void setAddtimes(Date addtimes) {
        this.addtimes = addtimes;
    }

    public Date getRefreshtimes() {
        return refreshtimes;
    }

    public void setRefreshtimes(Date refreshtimes) {
        this.refreshtimes = refreshtimes;
    }

    public Date getDeadlines() {
        return deadlines;
    }

    public void setDeadlines(Date deadlines) {
        this.deadlines = deadlines;
    }

    public String getComtifition() {
        return comtifition;
    }

    public void setComtifition(String comtifition) {
        this.comtifition = comtifition;
    }

    public String getOntication() {
        return ontication;
    }

    public void setOntication(String ontication) {
        this.ontication = ontication;
    }

    public String getRepsition() {
        return repsition;
    }

    public void setRepsition(String repsition) {
        this.repsition = repsition;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }

    public String getCompany_nature() {
        return company_nature;
    }

    public void setCompany_nature(String company_nature) {
        this.company_nature = company_nature;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getScales() {
        return scales;
    }

    public void setScales(String scales) {
        this.scales = scales;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getCompany_img() {
        return company_img;
    }

    public void setCompany_img(String company_img) {
        this.company_img = company_img;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CompanyBean{" +
                "id=" + id +
                ", uid=" + uid +
                ", companyname='" + companyname + '\'' +
                ", addtime=" + addtime +
                ", deadline=" + deadline +
                ", addtimes=" + addtimes +
                ", refreshtimes=" + refreshtimes +
                ", deadlines=" + deadlines +
                ", comtifition='" + comtifition + '\'' +
                ", ontication='" + ontication + '\'' +
                ", repsition='" + repsition + '\'' +
                ", short_name='" + short_name + '\'' +
                ", audit=" + audit +
                ", company_nature='" + company_nature + '\'' +
                ", address='" + address + '\'' +
                ", scales='" + scales + '\'' +
                ", telephone='" + telephone + '\'' +
                ", contents='" + contents + '\'' +
                ", company_img='" + company_img + '\'' +
                ", status=" + status +
                '}';
    }
}
 
