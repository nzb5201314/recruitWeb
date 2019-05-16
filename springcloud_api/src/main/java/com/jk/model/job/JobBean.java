/**
 * Copyright (C), 2019, 金科教育
 * FileName: JobBean
 * Author:   mrq
 * Date:     2019/5/13 21:02
 * Description: job
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名：mrq        修改时间           版本号              描述
 */
package com.jk.model.job;

import com.jk.pagerows.PageRows;

import java.io.Serializable;
import java.util.Date;

/**
 * 〈职位和公司表〉<br>
 * 〈job〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
public class JobBean extends PageRows implements Serializable {

    private static final long serialVersionUID = -2365601686868538580L;
    private Integer id;
    private Integer uid;
    private Integer addtime;
    private Integer deadline;
    private Integer refreshtime;
    private String jobs_name;   //工作名称
    private String companyname; //公司名称
    private Integer audit;      //审核状态
    private Date addtimes;      //创建时间
    private Date refreshtimes;  //刷新时间
    private Date deadlines;     //到期时间
    private Integer status;     //状态

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

    public Integer getRefreshtime() {
        return refreshtime;
    }

    public void setRefreshtime(Integer refreshtime) {
        this.refreshtime = refreshtime;
    }

    public String getJobs_name() {
        return jobs_name;
    }

    public void setJobs_name(String jobs_name) {
        this.jobs_name = jobs_name;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "JobBean{" +
                "id=" + id +
                ", uid=" + uid +
                ", addtime=" + addtime +
                ", deadline=" + deadline +
                ", refreshtime=" + refreshtime +
                ", jobs_name='" + jobs_name + '\'' +
                ", companyname='" + companyname + '\'' +
                ", audit=" + audit +
                ", addtimes=" + addtimes +
                ", refreshtimes=" + refreshtimes +
                ", deadlines=" + deadlines +
                ", status=" + status +
                '}';
    }
}
 
