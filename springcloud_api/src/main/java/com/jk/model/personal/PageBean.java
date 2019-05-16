/**
 * Copyright (C), 2019-2019,
 * FileName: PageBean
 * Author:   xwy
 * Date:     2019/5/15 11:47
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
public class PageBean {

    private Integer page;
    private Integer rows;



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

