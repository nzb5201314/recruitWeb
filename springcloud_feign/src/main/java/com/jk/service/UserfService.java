/**
 * Copyright (C), 2019,金科
 * FileName: UserfService
 * Author:   HT
 * Date:     2019/5/10 21:54
 * History:
 * HT          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service;

import com.jk.utils.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/10
 * @since 1.0.0
 */
@FeignClient(value = "SERVICE-PROVIDER",fallback = SchedualServiceHiHystric.class )
public interface UserfService extends UserService {

}

