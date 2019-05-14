/**
 * Copyright (C), 2019,金科
 * FileName: SystemServices
 * Author:   HT
 * Date:     2019/5/13 20:52
 * History:
 * HT          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.systemservice;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
@FeignClient(value = "SERVICE-PROVIDER")
public interface SystemServices extends SystemService  {


}


