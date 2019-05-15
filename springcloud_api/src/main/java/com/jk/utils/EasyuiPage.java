/** 
 * <pre>项目名称:treebook 
 * 文件名称:EasyuiPage.java 
 * 包名:com.jk.haot.utils 
 * 创建日期:2019年2月14日下午4:42:52 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.utils;

import java.io.Serializable;

/**
 * <pre>项目名称：treebook    
 * 类名称：EasyuiPage    
 * 类描述：    
 * 创建人：郝天  
 * 创建时间：2019年2月14日 下午4:42:52    
 * 修改人：郝天
 * 修改时间：2019年2月14日 下午4:42:52    
 * 修改备注：       
 * @version </pre>    
 */
public class EasyuiPage implements Serializable {
	private static final long serialVersionUID = -2661693683952309647L;
	private	Integer total;
	private	Object	rows;
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Object getRows() {
		return rows;
	}
	public void setRows(Object rows) {
		this.rows = rows;
	}
	/* (non-Javadoc)    
	 * @see java.lang.Object#toString()    
	 */
	@Override
	public String toString() {
		return "EasyuiPage [total=" + total + ", rows=" + rows + "]";
	}
	

}
