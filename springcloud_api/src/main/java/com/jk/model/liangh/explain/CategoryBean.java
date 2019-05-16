/**
 * Copyright (C), 2019, 金科
 * FileName: CategoryBean
 * Author:   Administrator
 * Date:     2019/5/16 10:35
 * History:
 */
package com.jk.model.liangh.explain;

import java.io.Serializable;

/**
 * 〈念如心〉<br> 
 * 〈说明页分类〉
 *
 * @author liangh
 * @create 2019/5/16
 * @since 1.0.0
 */
public class CategoryBean implements Serializable {

	private static final long serialVersionUID = 59868899236384288L;


	private Integer id;
	private String  categoryname;
	private Integer category_order;
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

	public Integer getCategory_order() {
		return category_order;
	}

	public void setCategory_order(Integer category_order) {
		this.category_order = category_order;
	}

	public Integer getAdmin_set() {
		return admin_set;
	}

	public void setAdmin_set(Integer admin_set) {
		this.admin_set = admin_set;
	}

	@Override
	public String toString() {
		return "CategoryBean{" +
				"id=" + id +
				", categoryname='" + categoryname + '\'' +
				", category_order=" + category_order +
				", admin_set=" + admin_set +
				'}';
	}
}
