/**
 * Copyright (C), 2019
 * FileName: PaymentService
 * Author:   nzb
 * Date:     2019/5/14 21:30
 * History:
 * nzb              <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.tool;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 〈一句话功能简述〉〈〉
 *
 * @author nzb
 * @create 2019/5/14
 * @since 1.0.0
 */
@FeignClient(value = "SERVICE-PROVIDER")
public interface PaymentService extends PaymentServiceApi {

}
