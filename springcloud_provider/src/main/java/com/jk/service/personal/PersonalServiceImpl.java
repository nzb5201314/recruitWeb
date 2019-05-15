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
import com.jk.model.personal.MembersBean;
import com.jk.model.personal.PersonalOrderBean;
import com.jk.model.personal.ResumeBean;
import com.jk.model.personal.UntyingBean;
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
    public HashMap<String, Object> queryshow(PersonalOrderBean personalOrderBean) {

        long count =personalMapper.queryshowcount(personalOrderBean);
        int start=(personalOrderBean.getPage()-1)*personalOrderBean.getRows();
        List<PersonalOrderBean> list=personalMapper.queryshow(start,personalOrderBean);
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
    public HashMap<String, Object> queryresumeshow(ResumeBean resumeBean) {
        long count =personalMapper.queryresumeshowcount(resumeBean);
        int start=(1-1)*5;
        List<PersonalOrderBean> list=personalMapper.queryresumeshow(start,resumeBean);
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

    //个人会员列表条查分页
    @Override
    @RequestMapping(value = "/querymembersshow")
    public HashMap<String, Object> querymembersshow(MembersBean membersBean) {
        long count =personalMapper.querymembersshowcount(membersBean);
        int start=(1-1)*5;
        List<PersonalOrderBean> list=personalMapper.querymembersshow(start,membersBean);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("total", count);
        hashMap.put("rows", list);
        return hashMap;
    }

    //个人会员列表新增
    @Override
    @RequestMapping(value = "/membersadd")
    public void membersadd(MembersBean membersBean) {
        personalMapper.membersadd(membersBean);
    }

    //个人会员列表批量删除
    @Override
    @RequestMapping(value = "/deletemembers")
    public void deletemembers(Integer[] ids) {
        personalMapper.deletemembers(ids);
    }
    //个人解绑列表条查分页
    @Override
    @RequestMapping(value = "/queryuntyingshow")
    public HashMap<String, Object> queryuntyingshow(UntyingBean untyingBean) {
        long count =personalMapper.queryuntyingshowcount(untyingBean);
        int start=(1-1)*5;
        List<PersonalOrderBean> list=personalMapper.queryuntyingshow(start,untyingBean);
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("total", count);
        hashMap.put("rows", list);
        return hashMap;
    }
    //个人解绑列表备注新增
    @Override
    @RequestMapping(value = "/untyingupdate")
    public void untyingupdate(UntyingBean untyingBean) {
        personalMapper.untyingupdate(untyingBean);
    }

    //个人解绑列表批量删除
    @Override
    @RequestMapping(value = "/deleteuntying")
    public void deleteuntying(Integer[] ids) {
        personalMapper.deleteuntying(ids);
    }


}

