/**
 * Copyright (C), 2019,金科
 * FileName: JournalBean
 * Author:   HT
 * Date:     2019/5/16 9:48
 * History:
 * HT          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model.systemmodel;


import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/16
 * @since 1.0.0
 */
@Document(collection="h_journal")
public class JournalBean implements Serializable {
    private static final long serialVersionUID = 6760167316323977415L;
    private String id;

    private Integer logid;//和登录id同步

    private String logurl;//日志地址

    private String logip;//日志ip

    private String operater;//日志名称

    private String logdata;//日志时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getLogurl() {
        return logurl;
    }

    public void setLogurl(String logurl) {
        this.logurl = logurl;
    }

    public String getLogip() {
        return logip;
    }

    public void setLogip(String logip) {
        this.logip = logip;
    }

    public String getOperater() {
        return operater;
    }

    public void setOperater(String operater) {
        this.operater = operater;
    }

    public String getLogdata() {
        return logdata;
    }

    public void setLogdata(String logdata) {
        this.logdata = logdata;
    }

    @Override
    public String toString() {
        return "JournalBean{" +
                "id='" + id + '\'' +
                ", logid=" + logid +
                ", logurl='" + logurl + '\'' +
                ", logip='" + logip + '\'' +
                ", operater='" + operater + '\'' +
                ", logdata='" + logdata + '\'' +
                '}';
    }
}

