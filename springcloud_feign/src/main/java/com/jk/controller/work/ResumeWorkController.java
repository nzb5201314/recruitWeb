/**
 * Copyright (C), 2019, 金科教育
 * FileName: ResumeWorkController
 * Author:   mrq
 * Date:     2019/5/13 22:07
 * Description: work
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名：mrq        修改时间           版本号              描述
 */
package com.jk.controller.work;

import com.jk.model.work.ResumeWorkBean;
import com.jk.service.work.ResumeWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * 〈公司〉<br>
 * 〈work〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
@RestController
public class ResumeWorkController {
    @Autowired
    private ResumeWorkService resumeWorkService;

    /**
     * 查询
     * @param ResumeWorkBean
     * @param page
     * @param rows
     */
    @RequestMapping(value = "/findResumeWorkList",method = RequestMethod.GET)
    public HashMap<String, Object> findResumeWorkList(Integer page, Integer rows, ResumeWorkBean resumeWorkBean){
        return resumeWorkService.findResumeWorkList(page,rows,resumeWorkBean);
    }
}
 
