package com.jk.service.personal;

import com.jk.model.personal.MembersBean;
import com.jk.model.personal.PersonalOrderBean;
import com.jk.model.personal.ResumeBean;
import com.jk.model.personal.UntyingBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

public interface PersonalService {

    //个人订单管理条查分页
    @RequestMapping(value = "/queryshow")
    HashMap<String, Object> queryshow(@RequestBody PersonalOrderBean personalOrderBean);
    //个人订单管理批量修改订单状态为已取消
    @RequestMapping(value = "/updatestate")
    void updatestate(@RequestParam(value = "ids")Integer[] ids);
    //个人简历列表条查分页
    @RequestMapping(value = "/queryresumeshow")
    HashMap<String, Object> queryresumeshow(@RequestBody ResumeBean resumeBean);
    //个人简历列表批量修改审核状态为已审核
    @RequestMapping(value = "/updateauditstate")
    void updateauditstate(@RequestParam(value = "ids")Integer[] ids);
    //个人简历列表照片批量修改审核状态为已审核
    @RequestMapping(value = "/updatephotoauditstate")
    void updatephotoauditstate(@RequestParam(value = "ids")Integer[] ids);
    //个人简历列表批量删除
    @RequestMapping(value = "/deleteresume")
    void deleteresume(@RequestParam(value = "ids")Integer[] ids);
    //个人会员列表条查分页
    @RequestMapping(value = "/querymembersshow")
    HashMap<String, Object> querymembersshow(@RequestBody MembersBean membersBean);
    //个人会员列表新增
    @RequestMapping(value = "/membersadd")
    void membersadd(@RequestBody MembersBean membersBean);
    //个人会员列表批量删除
    @RequestMapping(value = "/deletemembers")
    void deletemembers(@RequestParam(value = "ids")Integer[] ids);
    //个人解绑列表条查分页
    @RequestMapping(value = "/queryuntyingshow")
    HashMap<String, Object> queryuntyingshow(@RequestBody UntyingBean untyingBean);
    //个人解绑列表备注修改
    @RequestMapping(value = "/untyingupdate")
    void untyingupdate(@RequestBody UntyingBean untyingBean);
    //个人解绑列表批量删除
    @RequestMapping(value = "/deleteuntying")
    void deleteuntying(@RequestParam(value = "ids")Integer[] ids);
}
