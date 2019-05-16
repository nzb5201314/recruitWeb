/**
 * Copyright (C), 2019,金科
 * FileName: AreadivisionBean
 * Author:   HT
 * Date:     2019/5/16 15:25
 * History:
 * HT          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model.systemmodel;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/16
 * @since 1.0.0
 */
public class AreadivisionBean implements Serializable {
    private static final long serialVersionUID = -378993608731529940L;
    private Integer id;

    private Integer parentid;//子节点id

    private String categoryname;//城市名称

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    @Override
    public String toString() {
        return "AreadivisionBean{" +
                "id=" + id +
                ", parentid=" + parentid +
                ", categoryname='" + categoryname + '\'' +
                '}';
    }
}

