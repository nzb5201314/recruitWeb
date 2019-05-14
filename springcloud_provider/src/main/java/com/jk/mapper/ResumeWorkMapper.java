/**
 * Copyright (C), 2019, 金科教育
 * FileName: ResumeWorkMapper
 * Author:   mrq
 * Date:     2019/5/13 22:22
 * Description: work
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名：mrq        修改时间           版本号              描述
 */
package com.jk.mapper;

import com.jk.model.work.ResumeWorkBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈work〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
public interface ResumeWorkMapper {

    int findResumeWorkBeanCount(@Param("resumeWorkBean")ResumeWorkBean resumeWorkBean);

    List<ResumeWorkBean> findResumeWorkBeanPage(@Param("start") Integer start, @Param("rows")Integer rows, @Param("resumeWorkBean")ResumeWorkBean resumeWorkBean);
}
 
