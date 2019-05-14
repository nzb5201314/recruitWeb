/**
 * Copyright (C), 2019
 * FileName: PaymentController
 * Author:   nzb
 * Date:     2019/5/14 21:26
 * History:
 * nzb              <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller.tool;

import com.jk.model.systemmodel.Systemodel;
import com.jk.model.tool.Payment;
import com.jk.service.tool.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈支付方式〉〈〉
 *
 * @author nzb
 * @create 2019/5/14
 * @since 1.0.0
 */
@CrossOrigin
@Controller
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    /**
     * 〈支付方式查询〉〈〉
     *
     * @author nzb
     * @create 2019/5/14
     * @since 1.0.0
     */
    @RequestMapping(value = "/queryPayment")
    @ResponseBody
    public List<Payment> queryPayment(){
        return paymentService.queryPayment();
    }

    /**
     * 〈支付方式回显〉〈〉
     *
     * @author nzb
     * @create 2019/5/14
     * @since 1.0.0
     */
    @RequestMapping(value = "/queryPaymentById")
    @ResponseBody
    public Payment queryPaymentById(Integer id){
        return paymentService.queryPaymentById(id);
    }

    /**
     * 〈支付方式修改〉〈〉
     *
     * @author nzb
     * @create 2019/5/14
     * @since 1.0.0
     */
    @RequestMapping("updatePayment")
    @ResponseBody
    public Boolean updatePayment(Payment payment){
        try {
            paymentService.updatePayment(payment);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
