/**
 * Copyright (C), 2019, 金科教育
 * FileName: JobServiceApi
 * Author:   mrq
 * Date:     2019/5/13 22:05
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名：mrq        修改时间           版本号              描述
 */
package com.jk.service.job;

import com.jk.model.company.CompanyBean;
import com.jk.model.job.JobBean;
import com.jk.model.member.MemberBean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

/**
 * 〈一句话功能简述〉<br> 
 * 〈job〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
public interface JobServiceApi {

    @RequestMapping(value = "/findJobList")
    HashMap<String, Object> findJobList(@RequestBody JobBean jobBean);

    @RequestMapping(value = "/deleteJobById")
    void deleteJobById(@RequestParam("jobId") Integer[] jobId);

    @RequestMapping(value = "/findCompanyList")
    HashMap<String, Object> findCompanyList(@RequestBody CompanyBean companyBean);

    @RequestMapping(value = "/saveCompany")
    void saveCompany(@RequestBody CompanyBean companyBean);

    @RequestMapping(value = "/findMemberList")
    HashMap<String, Object> findMemberList(@RequestBody MemberBean memberBean);

    @RequestMapping(value = "/deleteCompanyById")
    void deleteCompanyById(@RequestParam("companyId") Integer[] companyId);

    @RequestMapping(value = "/saveMember")
    void saveMember(@RequestBody MemberBean memberBean);

    @RequestMapping(value = "/deleteMemberById")
    void deleteMemberById(@RequestParam("memberId") Integer[] memberId);
}
