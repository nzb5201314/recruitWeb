/**
 * Copyright (C), 2019,金科
 * FileName: IntegralprotocolBean
 * Author:   HT
 * Date:     2019/5/14 20:07
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
 * @create 2019/5/14
 * @since 1.0.0
 */
public class IntegralprotocolBean implements Serializable {

    private static final long serialVersionUID = 3256860083511254526L;

    private Integer id;

    private String  zhucexieyi; // 注册协议

    private String  substitutename; //积分代替名

    private String  Integralclassifier;//积分量词

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getZhucexieyi() {
        return zhucexieyi;
    }

    public void setZhucexieyi(String zhucexieyi) {
        this.zhucexieyi = zhucexieyi;
    }

    public String getSubstitutename() {
        return substitutename;
    }

    public void setSubstitutename(String substitutename) {
        this.substitutename = substitutename;
    }

    public String getIntegralclassifier() {
        return Integralclassifier;
    }

    public void setIntegralclassifier(String integralclassifier) {
        Integralclassifier = integralclassifier;
    }

    @Override
    public String toString() {
        return "IntegralprotocolBean{" +
                "id=" + id +
                ", zhucexieyi='" + zhucexieyi + '\'' +
                ", substitutename='" + substitutename + '\'' +
                ", Integralclassifier='" + Integralclassifier + '\'' +
                '}';
    }
}

