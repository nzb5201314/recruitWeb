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

import com.jk.model.tool.Payment;
import com.jk.service.tool.PaymentService;
import com.jk.utils.ExportDatabaseTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.util.List;
import java.util.UUID;

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

    /**
     * 〈数据库表查询〉〈〉
     *
     * @author nzb
     * @create 2019/5/14
     * @since 1.0.0
     */
    @RequestMapping(value = "/queryMysqlTable")
    @ResponseBody
    public List<String> queryMysqlTable(){
        List<String> list = paymentService.queryMysqlTable();
        return list;
    }

    /**
     * 〈数据库表导出并生成.sql文件〉〈〉
     *
     * @author nzb
     * @create 2019/5/14
     * @since 1.0.0
     */
    @RequestMapping(value = "/exportDatabase")
    @ResponseBody
    public Boolean exportDatabase(){
        try {
            if (ExportDatabaseTool.exportDatabaseTool("192.168.1.121", "root", "root", "D:/", "zhaopin")) {
                System.out.println("数据库成功备份！！！");
                return true;
            } else {
                System.out.println("数据库备份失败！！！");
                return false;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

}
