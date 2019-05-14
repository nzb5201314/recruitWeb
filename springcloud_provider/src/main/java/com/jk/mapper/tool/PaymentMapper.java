/**
 * Copyright (C), 2019
 * FileName: PaymentMapper
 * Author:   nzb
 * Date:     2019/5/14 21:40
 * History:
 * nzb              <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.mapper.tool;

import com.jk.model.tool.Payment;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 〈一句话功能简述〉〈〉
 *
 * @author nzb
 * @create 2019/5/14
 * @since 1.0.0
 */
public interface PaymentMapper {

    @Select("SELECT * FROM qs_payment")
    List<Payment> queryPaymentx();

    @Select("SELECT * FROM qs_payment WHERE id = #{id}")
    Payment queryPaymentById(Integer id);

    @Update("UPDATE qs_payment SET t.listorder=#{listorder},t.typename=#{typename},t.byname=#{byname},t.p_introduction=#{p_introduction},t.notes=#{notes},t.partnerid=#{partnerid},t.ytauthkey=#{ytauthkey},t.fee=#{fee},t.parameter1=#{parameter1},t.parameter2=#{parameter2},t.parameter3=#{parameter3},t.p_install=#{p_install}")
    void updatePayment(Payment payment);
}
