/**
 * Copyright (C), 2019, 金科教育
 * FileName: ResumeWorkBean
 * Author:   mrq
 * Date:     2019/5/13 21:02
 * Description: work
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名：mrq        修改时间           版本号              描述
 */
package com.jk.model.work;

import java.io.Serializable;

/**
 * 〈职位和公司表〉<br>
 * 〈work〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
public class ResumeWorkBean implements Serializable {

    private static final long serialVersionUID = -2365601686868538580L;
    private Integer id;
    private Integer pid;
    private Integer uid;
    private Integer startyear;
    private Integer startmonth;
    private Integer endyear;
    private Integer endmonth;
    private String companyname;
    private String jobs;
    private String achievements;
    private Integer todate;
    private Integer audit;
    private Integer addtime;
    private Integer refreshtime;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getStartyear() {
        return startyear;
    }

    public void setStartyear(Integer startyear) {
        this.startyear = startyear;
    }

    public Integer getStartmonth() {
        return startmonth;
    }

    public void setStartmonth(Integer startmonth) {
        this.startmonth = startmonth;
    }

    public Integer getEndyear() {
        return endyear;
    }

    public void setEndyear(Integer endyear) {
        this.endyear = endyear;
    }

    public Integer getEndmonth() {
        return endmonth;
    }

    public void setEndmonth(Integer endmonth) {
        this.endmonth = endmonth;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public Integer getTodate() {
        return todate;
    }

    public void setTodate(Integer todate) {
        this.todate = todate;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getRefreshtime() {
        return refreshtime;
    }

    public void setRefreshtime(Integer refreshtime) {
        this.refreshtime = refreshtime;
    }

    @Override
    public String toString() {
        return "ResumeWorkBean{" +
                "id=" + id +
                ", pid=" + pid +
                ", uid=" + uid +
                ", startyear=" + startyear +
                ", startmonth=" + startmonth +
                ", endyear=" + endyear +
                ", endmonth=" + endmonth +
                ", companyname='" + companyname + '\'' +
                ", jobs='" + jobs + '\'' +
                ", achievements='" + achievements + '\'' +
                ", todate=" + todate +
                ", audit=" + audit +
                ", addtime=" + addtime +
                ", refreshtime=" + refreshtime +
                '}';
    }
}
 
