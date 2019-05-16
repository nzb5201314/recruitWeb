/**
 * Copyright (C), 2019, 金科
 * FileName: CategoryBean
 * Author:   Administrator
 * Date:     2019/5/16 14:24
 * History:
 */
package com.jk.model.liangh.advertising;

import java.io.Serializable;

/**
 * 〈念如心〉<br> 
 * 〈广告栏位表〉
 *
 * @author liangh
 * @create 2019/5/16
 * @since 1.0.0
 */
public class CategoryBean implements Serializable {

	private static final long serialVersionUID = 1326269815165999035L;

	private Integer id;
	private String  theme;
	private String org;
	private String alias;
	private Integer type_id;
	private String  categoryname;
	private Integer width;
	private Integer height;
	private Integer floats;
	private Integer floating_top;
	private Integer floating_left;
	private Integer floating_right;
	private Integer admin_set;
	private Integer ad_num;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getOrg() {
		return org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public Integer getType_id() {
		return type_id;
	}

	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getFloating_top() {
		return floating_top;
	}

	public void setFloating_top(Integer floating_top) {
		this.floating_top = floating_top;
	}

	public Integer getFloating_left() {
		return floating_left;
	}

	public void setFloating_left(Integer floating_left) {
		this.floating_left = floating_left;
	}

	public Integer getFloating_right() {
		return floating_right;
	}

	public void setFloating_right(Integer floating_right) {
		this.floating_right = floating_right;
	}

	public Integer getAdmin_set() {
		return admin_set;
	}

	public void setAdmin_set(Integer admin_set) {
		this.admin_set = admin_set;
	}

	public Integer getAd_num() {
		return ad_num;
	}

	public void setAd_num(Integer ad_num) {
		this.ad_num = ad_num;
	}

	public Integer getFloats() {
		return floats;
	}

	public void setFloats(Integer floats) {
		this.floats = floats;
	}

	@Override
	public String toString() {
		return "CategoryBean{" +
				"id=" + id +
				", theme='" + theme + '\'' +
				", org='" + org + '\'' +
				", alias='" + alias + '\'' +
				", type_id=" + type_id +
				", categoryname='" + categoryname + '\'' +
				", width=" + width +
				", height=" + height +
				", floats=" + floats +
				", floating_top=" + floating_top +
				", floating_left=" + floating_left +
				", floating_right=" + floating_right +
				", admin_set=" + admin_set +
				", ad_num=" + ad_num +
				'}';
	}
}
