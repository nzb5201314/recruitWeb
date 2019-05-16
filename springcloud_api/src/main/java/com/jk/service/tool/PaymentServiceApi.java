/**
 * Copyright (C), 2019
 * FileName: PaymentServiceApi
 * Author:   nzb
 * Date:     2019/5/14 21:33
 * History:
 * nzb              <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.tool;

import com.jk.model.tool.Payment;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉〈〉
 *
 * @author nzb
 * @create 2019/5/14
 * @since 1.0.0
 */
public interface PaymentServiceApi {

    @RequestMapping(value = "/queryPayment")
    List<Payment> queryPayment();

    @RequestMapping(value = "/queryPaymentById")
    Payment queryPaymentById(@RequestParam("id")Integer id);

    @RequestMapping("undatasystemodel")
    void updatePayment(@RequestBody Payment payment);

    @RequestMapping(value = "/queryMysqlTable")
    List<String> queryMysqlTable();
}
