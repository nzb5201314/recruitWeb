/**
 * Copyright (C), 2019-2019,
 * FileName: Personal
 * Author:   xwy
 * Date:     2019/5/14 9:23
 * History:
 * xwy          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller.personal;


import com.jk.model.personal.PersonalOrderBean;
import com.jk.model.personal.ResumeBean;
import com.jk.service.personal.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author Administrator
 * @create 2019/5/14
 * @since 1.0.0
 */
@Controller
public class Personal {

    @Autowired
    private PersonalService personalService;

    //个人订单管理条查分页
    @RequestMapping(value = "/queryshow")
    @ResponseBody
    public HashMap<String, Object> queryshow(Integer page, Integer rows, PersonalOrderBean personalOrderBean){
        return personalService.queryshow(page,rows,personalOrderBean);
    }

    //个人订单管理批量修改订单状态为已取消
    @RequestMapping(value = "/updatestate")
    @ResponseBody
    public void updatestate(Integer [] ids){
        personalService.updatestate(ids);
    }


    //个人简历列表条查分页
    @RequestMapping(value = "/queryresumeshow")
    @ResponseBody
    public HashMap<String, Object> queryresumeshow(Integer page, Integer rows, ResumeBean resumeBean){
        return personalService.queryresumeshow(page,rows,resumeBean);
    }

    //个人简历列表批量修改审核状态为已审核
    @RequestMapping(value = "/updateauditstate")
    @ResponseBody
    public void updateauditstate(Integer [] ids){
        personalService.updateauditstate(ids);
    }


    //个人简历列表照片批量修改审核状态为已审核
    @RequestMapping(value = "/updatephotoauditstate")
    @ResponseBody
    public void updatephotoauditstate(Integer [] ids){
        personalService.updatephotoauditstate(ids);
    }


    //个人简历列表批量删除
    @RequestMapping(value = "/deleteresume")
    @ResponseBody
    public void deleteresume(Integer [] ids){
        personalService.deleteresume(ids);
    }



}

