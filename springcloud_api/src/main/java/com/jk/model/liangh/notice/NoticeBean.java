/**
 * Copyright (C), 2019, 金科
 * FileName: NoticeBean
 * Author:   Administrator
 * Date:     2019/5/14 14:45
 * History:
 */
package com.jk.model.liangh.notice;



import java.io.Serializable;

/**
 * 〈念如心〉<br> 
 * 〈公告表〉
 *
 * @author liangh
 * @create 2019/5/14
 * @since 1.0.0
 */

public class NoticeBean implements Serializable  {

	private static final long serialVersionUID = 6865262991060282825L;

	private Integer id;

	private Integer type_id;

	private String title;

	private String tit_color;

	private String content;

	private Integer tit_b;

	private Integer is_display;

	private String is_url;

	private String seo_keywords;

	private String seo_description;

	private Integer click;

	private Integer addtime;

	private Integer startTime;

	private Integer sort;

	private String  categoryname;

	public Integer getStartTime() {
		return startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getType_id() {
		return type_id;
	}

	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTit_color() {
		return tit_color;
	}

	public void setTit_color(String tit_color) {
		this.tit_color = tit_color;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getTit_b() {
		return tit_b;
	}

	public void setTit_b(Integer tit_b) {
		this.tit_b = tit_b;
	}

	public Integer getIs_display() {
		return is_display;
	}

	public void setIs_display(Integer is_display) {
		this.is_display = is_display;
	}

	public String getIs_url() {
		return is_url;
	}

	public void setIs_url(String is_url) {
		this.is_url = is_url;
	}

	public String getSeo_keywords() {
		return seo_keywords;
	}

	public void setSeo_keywords(String seo_keywords) {
		this.seo_keywords = seo_keywords;
	}

	public String getSeo_description() {
		return seo_description;
	}

	public void setSeo_description(String seo_description) {
		this.seo_description = seo_description;
	}

	public Integer getClick() {
		return click;
	}

	public void setClick(Integer click) {
		this.click = click;
	}

	public Integer getAddtime() {
		return addtime;
	}

	public void setAddtime(Integer addtime) {
		this.addtime = addtime;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "NoticeBean{" +
				"id=" + id +
				", type_id=" + type_id +
				", title='" + title + '\'' +
				", tit_color='" + tit_color + '\'' +
				", content='" + content + '\'' +
				", tit_b=" + tit_b +
				", is_display=" + is_display +
				", is_url='" + is_url + '\'' +
				", seo_keywords='" + seo_keywords + '\'' +
				", seo_description='" + seo_description + '\'' +
				", click=" + click +
				", addtime=" + addtime +
				", startTime=" + startTime +
				", sort=" + sort +
				", categoryname='" + categoryname + '\'' +
				'}';
	}
}
