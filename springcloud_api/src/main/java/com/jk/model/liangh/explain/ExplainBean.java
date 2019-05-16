/**
 * Copyright (C), 2019, 金科
 * FileName: ExplainBean
 * Author:   Administrator
 * Date:     2019/5/16 10:23
 * History:
 */
package com.jk.model.liangh.explain;

import java.io.Serializable;

/**
 * 〈念如心〉<br> 
 * 〈说明页〉
 *
 * @author liangh
 * @create 2019/5/16
 * @since 1.0.0
 */
public class ExplainBean
		implements Serializable {

	private static final long serialVersionUID = -7894383836437567611L;



	private Integer id;
	private Integer itype_idd;
	private String title;
	private String content;
	private String tit_color;
	private Integer tit_b;
	private Integer is_display;
	private String is_url;
	private String seo_keywords;
	private String seo_description;
	private Integer click;
	private Integer addtime;
	private Integer show_order;
	private String    categoryname;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getItype_idd() {
		return itype_idd;
	}

	public void setItype_idd(Integer itype_idd) {
		this.itype_idd = itype_idd;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTit_color() {
		return tit_color;
	}

	public void setTit_color(String tit_color) {
		this.tit_color = tit_color;
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

	public Integer getShow_order() {
		return show_order;
	}

	public void setShow_order(Integer show_order) {
		this.show_order = show_order;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	@Override
	public String toString() {
		return "ExplainBean{" +
				"id=" + id +
				", itype_idd=" + itype_idd +
				", title='" + title + '\'' +
				", content='" + content + '\'' +
				", tit_color='" + tit_color + '\'' +
				", tit_b=" + tit_b +
				", is_display=" + is_display +
				", is_url='" + is_url + '\'' +
				", seo_keywords='" + seo_keywords + '\'' +
				", seo_description='" + seo_description + '\'' +
				", click=" + click +
				", addtime=" + addtime +
				", show_order=" + show_order +
				", categoryname='" + categoryname + '\'' +
				'}';
	}
}
