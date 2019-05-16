/**
 * Copyright (C), 2019, 金科教育
 * FileName: JobServiceImpl
 * Author:   mrq
 * Date:     2019/5/13 22:20
 * Description: job
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名：mrq        修改时间           版本号              描述
 */
package com.jk.service;

import com.jk.mapper.JobMapper;
import com.jk.model.company.CompanyBean;
import com.jk.model.job.JobBean;
import com.jk.model.member.MemberBean;
import com.jk.service.job.JobServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈job〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
@RestController
public class JobServiceImpl implements JobServiceApi {
    @Autowired
    private JobMapper jobMapper;

    @Override
    public HashMap<String, Object> findJobList(JobBean jobBean) {
        HashMap<String, Object> hashMap = new HashMap<>();
        //查询总条数
        int total = jobMapper.findJobCount(jobBean);
        //分页查询
        int start = (1-1)*2;//开始条数
        List<JobBean> list = jobMapper.findJobList(start,jobBean);
        hashMap.put("total", total);
        hashMap.put("rows", list);
        return hashMap;
    }

    @Override
    public void deleteJobById(Integer[] jobId) {
        jobMapper.deleteJobById(jobId);
    }

    @Override
    public HashMap<String, Object> findCompanyList(CompanyBean companyBean) {
        HashMap<String, Object> hashMap = new HashMap<>();
        //查询总条数
        int total = jobMapper.findCompanyCount(companyBean);
        //分页查询
        int start = (1-1)*2;//开始条数
        List<CompanyBean> list = jobMapper.findCompanyList(start,companyBean);
        hashMap.put("total", total);
        hashMap.put("rows", list);
        return hashMap;
    }

    @Override
    public void saveCompany(CompanyBean companyBean) {
        jobMapper.saveCompany(companyBean);
    }

    @Override
    public void deleteCompanyById(Integer[] companyId) {
        jobMapper.deleteCompanyById(companyId);
    }

    @Override
    public HashMap<String, Object> findMemberList(MemberBean memberBean) {
        HashMap<String, Object> hashMap = new HashMap<>();
        //查询总条数
        int total = jobMapper.findMemberCount(memberBean);
        //分页查询
        int start = (1-1)*2;//开始条数
        List<MemberBean> list = jobMapper.findMemberList(start,memberBean);
        hashMap.put("total", total);
        hashMap.put("rows", list);
        return hashMap;
    }

    @Override
    public void saveMember(MemberBean memberBean) {
        jobMapper.saveMember(memberBean);
    }

    @Override
    public void deleteMemberById(Integer[] memberId) {
        jobMapper.deleteMemberById(memberId);
    }
}
 
