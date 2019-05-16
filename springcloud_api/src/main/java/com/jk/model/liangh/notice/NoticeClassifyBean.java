/**
 * Copyright (C), 2019, 金科
 * FileName: NoticeClassifyBean
 * Author:   Administrator
 * Date:     2019/5/15 19:15
 * History:
 */
package com.jk.model.liangh.notice;

import java.io.Serializable;

/**
 * 〈念如心〉<br> 
 * 〈公告分类表〉
 *
 * @author liangh
 * @create 2019/5/15
 * @since 1.0.0
 */
public class NoticeClassifyBean implements Serializable {

	private static final long serialVersionUID = 8157852639030054879L;

	private Integer id;
	private String  categoryname;
	private Integer sort;
	private Integer admin_set;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getAdmin_set() {
		return admin_set;
	}

	public void setAdmin_set(Integer admin_set) {
		this.admin_set = admin_set;
	}

	@Override
	public String toString() {
		return "NoticeClassifyBean{" +
				"id=" + id +
				", categoryname='" + categoryname + '\'' +
				", sort=" + sort +
				", admin_set=" + admin_set +
				'}';
	}
}
