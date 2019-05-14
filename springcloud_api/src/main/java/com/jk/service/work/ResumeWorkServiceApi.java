/**
 * Copyright (C), 2019, 金科教育
 * FileName: ResumeWorkServiceApi
 * Author:   mrq
 * Date:     2019/5/13 22:05
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名：mrq        修改时间           版本号              描述
 */
package com.jk.service.work;

import com.jk.model.work.ResumeWorkBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈work〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
public interface ResumeWorkServiceApi {
    @RequestMapping(value = "/findResumeWorkList",method = RequestMethod.GET)
    HashMap<String, Object> findResumeWorkList(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows, @RequestBody ResumeWorkBean resumeWorkBean);
}
