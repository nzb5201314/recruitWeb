/**
 * Copyright (C), 2019, 金科教育
 * FileName: JobMapper
 * Author:   mrq
 * Date:     2019/5/13 22:22
 * Description: job
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名：mrq        修改时间           版本号              描述
 */
package com.jk.mapper;

import com.jk.model.company.CompanyBean;
import com.jk.model.job.JobBean;
import com.jk.model.member.MemberBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈job〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
public interface JobMapper {

    int findJobCount(@Param("jobBean")JobBean jobBean);

    List<JobBean> findJobList(@Param("start") Integer start,@Param("jobBean") JobBean jobBean);

    void deleteJobById(Integer[] jobId);

    int findCompanyCount(@Param("companyBean") CompanyBean companyBean);

    List<CompanyBean> findCompanyList(@Param("start")Integer start, @Param("companyBean")CompanyBean companyBean);

    void saveCompany(CompanyBean companyBean);

    int findMemberCount(@Param("memberBean") MemberBean memberBean);

    List<MemberBean> findMemberList(@Param("start")Integer start,  @Param("memberBean")MemberBean memberBean);

    void deleteCompanyById(Integer[] companyId);

    void saveMember(MemberBean memberBean);

    void deleteMemberById(Integer[] memberId);
}
 
