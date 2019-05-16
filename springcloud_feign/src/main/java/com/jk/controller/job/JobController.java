/**
 * Copyright (C), 2019, 金科教育
 * FileName: ResumeWorkController
 * Author:   mrq
 * Date:     2019/5/13 22:07
 * Description: job
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名：mrq        修改时间           版本号              描述
 */
package com.jk.controller.job;

import com.jk.model.company.CompanyBean;
import com.jk.model.job.JobBean;
import com.jk.model.member.MemberBean;
import com.jk.service.job.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * 〈公司职位〉<br>
 * 〈job〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
@RestController
@CrossOrigin
public class JobController {
    @Autowired
    private JobService jobService;

    /**
     * 职位管理查询
     * @param JobBean
     * @param page
     * @param rows
     */
    @RequestMapping(value = "/findJobList")
    public HashMap<String, Object> findJobList(JobBean jobBean){
        return jobService.findJobList(jobBean);
    }

    /**
     * 职位管理删除
     * @param Integer[] jobId
     */
    @RequestMapping(value = "/deleteJobById")
    public Boolean deleteJobById(Integer[] jobId){
        try {
            jobService.deleteJobById(jobId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 企业管理查询
     * @param JobBean
     * @param page
     * @param rows
     */
    @RequestMapping(value = "/findCompanyList")
    public HashMap<String, Object> findCompanyList(CompanyBean companyBean){
        return jobService.findCompanyList(companyBean);
    }

    /**
     * 企业新增
     * @param companyBean
     */
    @RequestMapping(value = "/saveCompany")
    public void saveCompany(CompanyBean companyBean){
        jobService.saveCompany(companyBean);
    }

    /**
     * 企业删除
     * @param Integer[] companyId
     */
    @RequestMapping(value = "/deleteCompanyById")
    public Boolean deleteCompanyById(Integer[] companyId){
        try {
            jobService.deleteCompanyById(companyId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 会员查询
     * @param JobBean
     * @param page
     * @param rows
     */
    @RequestMapping(value = "/findMemberList")
    public HashMap<String, Object> findMemberList(MemberBean memberBean){
        return jobService.findMemberList(memberBean);
    }

    /**
     * 会员新增
     * @param MemberBean
     */
    @RequestMapping(value = "/saveMember")
    public void saveMember(MemberBean memberBean){
        jobService.saveMember(memberBean);
    }

    /**
     * 会员删除
     * @param String[] memberId
     */
    @RequestMapping(value = "/deleteMemberById")
    public Boolean deleteMemberById(Integer[] memberId){
        try {
            jobService.deleteMemberById(memberId);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
 
