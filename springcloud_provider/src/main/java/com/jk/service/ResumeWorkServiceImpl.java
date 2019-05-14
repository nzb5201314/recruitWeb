/**
 * Copyright (C), 2019, 金科教育
 * FileName: ResumeWorkServiceImpl
 * Author:   mrq
 * Date:     2019/5/13 22:20
 * Description: work
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名：mrq        修改时间           版本号              描述
 */
package com.jk.service;

import com.jk.mapper.ResumeWorkMapper;
import com.jk.model.work.ResumeWorkBean;
import com.jk.service.work.ResumeWorkServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈work〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
@RestController
public class ResumeWorkServiceImpl implements ResumeWorkServiceApi{
    @Autowired
    private ResumeWorkMapper resumeWorkMapper;

    @Override
    public HashMap<String, Object> findResumeWorkList(Integer page, Integer rows, ResumeWorkBean resumeWorkBean) {
        HashMap<String, Object> hashMap = new HashMap<>();
        //查询总条数
        int total = resumeWorkMapper.findResumeWorkBeanCount(resumeWorkBean);
        //分页查询
        int start = (page-1)*rows;//开始条数
        List<ResumeWorkBean> list = resumeWorkMapper.findResumeWorkBeanPage(start,rows,resumeWorkBean);
        hashMap.put("total", total);
        hashMap.put("rows", list);
        return hashMap;
    }
}
 
