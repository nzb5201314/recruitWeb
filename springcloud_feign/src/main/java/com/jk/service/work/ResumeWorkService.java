/**
 * Copyright (C), 2019, 金科教育
 * FileName: ResumeWorkService
 * Author:   mrq
 * Date:     2019/5/13 22:11
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名：mrq        修改时间           版本号              描述
 */
package com.jk.service.work;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * 〈一句话功能简述〉<br> 
 * 〈work〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
@FeignClient(value = "SERVICE-PROVIDER")
public interface ResumeWorkService extends ResumeWorkServiceApi {

}
