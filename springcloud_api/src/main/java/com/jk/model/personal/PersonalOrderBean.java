/**
 * Copyright (C), 2019-2019,
 * FileName: PersonalOrderBean
 * Author:   xwy
 * Date:     2019/5/14 16:32
 * History:
 * xwy          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.model.personal;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author Administrator
 * @create 2019/5/14
 * @since 1.0.0
 */
public class PersonalOrderBean extends PageBean {

    private Integer id;    //id
    private Double amount;   //金额
    private String notes;   //备注说明
    private String oid;     //订单编号
    private Integer addtime;     //添加时间：1三天内，2一周内，3一月内，4半年内，5一年内
    private String payment_time;    //申请时间（付款时间）
    private Integer pay_type;   //支付类型：1积分 2现金 3现金+积分
    private Integer is_paid;    //是否已付1待支付 2已完成（已支付）3已取消
    private Integer order_type;  //订单类型:1简历置顶，2醒目标签，3简历模板
    private Integer uid;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public String getPayment_time() {
        return payment_time;
    }

    public void setPayment_time(String payment_time) {
        this.payment_time = payment_time;
    }

    public Integer getPay_type() {
        return pay_type;
    }

    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }

    public Integer getIs_paid() {
        return is_paid;
    }

    public void setIs_paid(Integer is_paid) {
        this.is_paid = is_paid;
    }

    public Integer getOrder_type() {
        return order_type;
    }

    public void setOrder_type(Integer order_type) {
        this.order_type = order_type;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "PersonalOrderBean{" +
                "id=" + id +
                ", amount=" + amount +
                ", notes='" + notes + '\'' +
                ", oid='" + oid + '\'' +
                ", addtime=" + addtime +
                ", payment_time='" + payment_time + '\'' +
                ", pay_type=" + pay_type +
                ", is_paid=" + is_paid +
                ", order_type=" + order_type +
                ", uid=" + uid +
                ", username='" + username + '\'' +
                '}';
    }
}

