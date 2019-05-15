/**
 * Copyright (C), 2019-2019,
 * FileName: ResumeBean
 * Author:   xwy
 * Date:     2019/5/14 20:03
 * History:
 * xwy          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model.personal;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author Administrator
 * @create 2019/5/14
 * @since 1.0.0
 */
public class ResumeBean extends PageBean{
    private Integer id; //简历id
    private Integer display; //是否展示
    private Integer audit;  //审查状态
    private String title;  //标题
    private String fullname;  //全名
    private Integer photo;  //是否有照片
    private String photo_img;  //照片
    private Integer photo_audit;  //照片审查状态
    private Integer addtime;    //添加时间
    private Integer refreshtime; //刷新时间
    private String stime;   //创建时间
    private Integer complete_percent; //简历完整百分比
    private String current; //最近刷新时间
    private Integer sort;  //排序

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Integer getPhoto() {
        return photo;
    }

    public void setPhoto(Integer photo) {
        this.photo = photo;
    }

    public String getPhoto_img() {
        return photo_img;
    }

    public void setPhoto_img(String photo_img) {
        this.photo_img = photo_img;
    }

    public Integer getPhoto_audit() {
        return photo_audit;
    }

    public void setPhoto_audit(Integer photo_audit) {
        this.photo_audit = photo_audit;
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

    public String getStime() {
        return stime;
    }

    public void setStime(String stime) {
        this.stime = stime;
    }

    public Integer getComplete_percent() {
        return complete_percent;
    }

    public void setComplete_percent(Integer complete_percent) {
        this.complete_percent = complete_percent;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "ResumeBean{" +
                "id=" + id +
                ", display=" + display +
                ", audit=" + audit +
                ", title='" + title + '\'' +
                ", fullname='" + fullname + '\'' +
                ", photo=" + photo +
                ", photo_img='" + photo_img + '\'' +
                ", photo_audit=" + photo_audit +
                ", addtime=" + addtime +
                ", refreshtime=" + refreshtime +
                ", stime='" + stime + '\'' +
                ", complete_percent=" + complete_percent +
                ", current='" + current + '\'' +
                ", sort=" + sort +
                '}';
    }
}

