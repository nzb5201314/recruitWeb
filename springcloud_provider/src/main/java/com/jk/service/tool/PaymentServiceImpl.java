/**
 * Copyright (C), 2019
 * FileName: PaymentServiceImpl
 * Author:   nzb
 * Date:     2019/5/14 21:42
 * History:
 * nzb              <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.tool;

import com.jk.mapper.tool.PaymentMapper;
import com.jk.model.tool.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈一句话功能简述〉〈〉
 *
 * @author nzb
 * @create 2019/5/14
 * @since 1.0.0
 */
@RestController
public class PaymentServiceImpl implements PaymentServiceApi
{

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public List<Payment> queryPayment() {
        return paymentMapper.queryPaymentx();
    }

    @Override
    public Payment queryPaymentById(Integer id) {
        return paymentMapper.queryPaymentById(id);
    }

    @Override
    public void updatePayment(Payment payment) {
        paymentMapper.updatePayment(payment);
    }

    @Override
    public List<String> queryMysqlTable() {
        return paymentMapper.queryMysqlTable();
    }
}
