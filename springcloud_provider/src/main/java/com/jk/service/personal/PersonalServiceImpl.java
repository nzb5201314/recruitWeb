/**
 * Copyright (C), 2019-2019,
 * FileName: PersonalServiceImpl
 * Author:   xwy
 * Date:     2019/5/14 9:25
 * History:
 * xwy          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.personal;

import com.jk.mapper.personal.PersonalMapper;
import com.jk.model.personal.PersonalOrderBean;
import com.jk.model.personal.ResumeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author Administrator
 * @create 2019/5/14
 * @since 1.0.0
 */
@RestController
public class PersonalServiceImpl implements PersonalService {
    @Autowired
    private PersonalMapper personalMapper;

    //个人订单管理条查分页
    @Override
    @RequestMapping(value = "/queryshow")
    public HashMap<String, Object> queryshow(Integer page, Integer rows, PersonalOrderBean personalOrderBean) {

        long count =personalMapper.queryshowcount(personalOrderBean);
        int start=(page-1)*rows;
        List<PersonalOrderBean> list=personalMapper.queryshow(start,rows,personalOrderBean);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("total", count);
        hashMap.put("rows", list);
        return hashMap;
    }
    //个人订单管理批量修改订单状态为已取消
    @Override
    @RequestMapping(value = "/updatestate")
    public void updatestate(Integer[] ids) {
        personalMapper.updatestate(ids);
    }

    //个人简历列表条查分页
    @Override
    @RequestMapping(value = "/queryresumeshow")
    public HashMap<String, Object> queryresumeshow(Integer page, Integer rows, ResumeBean resumeBean) {
        long count =personalMapper.queryresumeshowcount(resumeBean);
        int start=(page-1)*rows;
        List<PersonalOrderBean> list=personalMapper.queryresumeshow(start,rows,resumeBean);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("total", count);
        hashMap.put("rows", list);
        return hashMap;
    }

    //个人简历列表批量修改审核状态为已审核
    @Override
    @RequestMapping(value = "/updateauditstate")
    public void updateauditstate(Integer[] ids) {
        personalMapper.updateauditstate(ids);
    }
    //个人简历列表照片批量修改审核状态为已审核
    @Override
    @RequestMapping(value = "/updatephotoauditstate")
    public void updatephotoauditstate(Integer[] ids) {
        personalMapper.updatephotoauditstate(ids);
    }

    //个人简历列表批量删除
    @Override
    @RequestMapping(value = "/deleteresume")
    public void deleteresume(Integer[] ids) {
        personalMapper.deleteresume(ids);
    }
}

