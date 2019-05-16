/**
 * Copyright (C), 2019-2019,
 * FileName: UntyingBean
 * Author:   xwy
 * Date:     2019/5/15 15:55
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
public class UntyingBean extends PageBean{
    private Integer untyingid; //解绑id
    private String untyingtime; //解绑时间
    private String untyingnum; //所解绑的号码
    private String remarks; //备注
    private Integer uid; //会员id
    private Integer rid; //简历id
    private String username; //用户名

    private Integer untytime; //解绑时间分段（条查）1三天内，2一周内，3一月内，4半年内，5一年内


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUntyingid() {
        return untyingid;
    }

    public void setUntyingid(Integer untyingid) {
        this.untyingid = untyingid;
    }

    public String getUntyingtime() {
        return untyingtime;
    }

    public void setUntyingtime(String untyingtime) {
        this.untyingtime = untyingtime;
    }

    public String getUntyingnum() {
        return untyingnum;
    }

    public void setUntyingnum(String untyingnum) {
        this.untyingnum = untyingnum;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getUntytime() {
        return untytime;
    }

    public void setUntytime(Integer untytime) {
        this.untytime = untytime;
    }

    @Override
    public String toString() {
        return "UntyingBean{" +
                "untyingid=" + untyingid +
                ", untyingtime='" + untyingtime + '\'' +
                ", untyingnum='" + untyingnum + '\'' +
                ", remarks='" + remarks + '\'' +
                ", uid=" + uid +
                ", rid=" + rid +
                ", username='" + username + '\'' +
                ", untytime=" + untytime +
                '}';
    }
}

