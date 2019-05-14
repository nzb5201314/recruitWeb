/**
 * Copyright (C), 2019,金科
 * FileName: Systemodel
 * Author:   HT
 * Date:     2019/5/13 21:32
 * History:
 * HT          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model.systemmodel;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈网站配置〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
public class Systemodel implements Serializable {
    private static final long serialVersionUID = -7838337232332618755L;
    private Integer id;

    private String sitename;//网站名称 1

    private String toptel;//顶部联系电话 5

    private String bootomtel;//底部联系电话

    private String address;//联系地址

    private String bottomother;//底部其他

    private String icp;//备案信息

    private Integer isclose;//站点是否关闭   0=关闭 1=开启

    private String closereason;//站点关闭原因

    private String statistics;//站点统计

    private String contactemail;//网站联系邮箱

    private String sylogo; //网站首页Logo

    private String hylogo;//网站会员中心Logo

    private String qtlogo;//网站其它页Logo：

    private String indexbottomwx;//标题

    private String indexbottominfo;//内容

    private String weixinimg;//二维码图片

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public String getToptel() {
        return toptel;
    }

    public void setToptel(String toptel) {
        this.toptel = toptel;
    }

    public String getBootomtel() {
        return bootomtel;
    }

    public void setBootomtel(String bootomtel) {
        this.bootomtel = bootomtel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBottomother() {
        return bottomother;
    }

    public void setBottomother(String bottomother) {
        this.bottomother = bottomother;
    }

    public String getIcp() {
        return icp;
    }

    public void setIcp(String icp) {
        this.icp = icp;
    }

    public Integer getIsclose() {
        return isclose;
    }

    public void setIsclose(Integer isclose) {
        this.isclose = isclose;
    }

    public String getClosereason() {
        return closereason;
    }

    public void setClosereason(String closereason) {
        this.closereason = closereason;
    }

    public String getStatistics() {
        return statistics;
    }

    public void setStatistics(String statistics) {
        this.statistics = statistics;
    }

    public String getContactemail() {
        return contactemail;
    }

    public void setContactemail(String contactemail) {
        this.contactemail = contactemail;
    }

    public String getSylogo() {
        return sylogo;
    }

    public void setSylogo(String sylogo) {
        this.sylogo = sylogo;
    }

    public String getHylogo() {
        return hylogo;
    }

    public void setHylogo(String hylogo) {
        this.hylogo = hylogo;
    }

    public String getQtlogo() {
        return qtlogo;
    }

    public void setQtlogo(String qtlogo) {
        this.qtlogo = qtlogo;
    }

    public String getIndexbottomwx() {
        return indexbottomwx;
    }

    public void setIndexbottomwx(String indexbottomwx) {
        this.indexbottomwx = indexbottomwx;
    }

    public String getIndexbottominfo() {
        return indexbottominfo;
    }

    public void setIndexbottominfo(String indexbottominfo) {
        this.indexbottominfo = indexbottominfo;
    }

    public String getWeixinimg() {
        return weixinimg;
    }

    public void setWeixinimg(String weixinimg) {
        this.weixinimg = weixinimg;
    }

    @Override
    public String toString() {
        return "Systemodel{" +
                "id=" + id +
                ", sitename='" + sitename + '\'' +
                ", toptel='" + toptel + '\'' +
                ", bootomtel='" + bootomtel + '\'' +
                ", address='" + address + '\'' +
                ", bottomother='" + bottomother + '\'' +
                ", icp='" + icp + '\'' +
                ", isclose=" + isclose +
                ", closereason='" + closereason + '\'' +
                ", statistics='" + statistics + '\'' +
                ", contactemail='" + contactemail + '\'' +
                ", sylogo='" + sylogo + '\'' +
                ", hylogo='" + hylogo + '\'' +
                ", qtlogo='" + qtlogo + '\'' +
                ", indexbottomwx='" + indexbottomwx + '\'' +
                ", indexbottominfo='" + indexbottominfo + '\'' +
                ", weixinimg='" + weixinimg + '\'' +
                '}';
    }
}

