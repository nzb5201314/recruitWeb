/**
 * Copyright (C), 2019, 金科
 * FileName: PageBean
 * Author:   Administrator
 * Date:     2019/5/15 8:58
 * History:
 */
package com.jk.model.liangh;

import com.jk.model.liangh.notice.NoticeBean;

import java.io.Serializable;

/**
 * 〈念如心〉<br> 
 * 〈分页实体类〉
 *
 * @author liangh
 * @create 2019/5/15
 * @since 1.0.0
 */


public class PageBean  extends NoticeBean implements Serializable {

	private static final long serialVersionUID = 10798569562678065L;
	private Integer page=1;
	private Integer rows=10;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "PageBean{" +
				"page=" + page +
				", rows=" + rows +
				'}';
	}
}
