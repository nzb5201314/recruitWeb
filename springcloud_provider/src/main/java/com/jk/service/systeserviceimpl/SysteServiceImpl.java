/**
 * Copyright (C), 2019,金科
 * FileName: SysteServiceImpl
 * Author:   HT
 * Date:     2019/5/13 21:05
 * History:
 * HT          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.systeserviceimpl;

import com.jk.mapper.systemapper.SysteMapper;
import com.jk.model.systemmodel.IntegralprotocolBean;
import com.jk.model.systemmodel.MemberBean;
import com.jk.model.systemmodel.Systemodel;
import com.jk.service.systemservice.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
@RestController
public class SysteServiceImpl implements SystemService {
    @Autowired
    private SysteMapper systeMapper;
    //回显网站配置里的网站配置和首页底部配置模块
    @Override
    public Systemodel huixian() {

        return systeMapper.huixian();
    }

    //修改网站配置里的网站配置和首页底部配置模块
    @Override
    public void undatamenu(Systemodel systemodel) {
        if (systemodel.getIndexbottominfo()!=null||systemodel.getIndexbottomwx()!=null){
            //修改首页底部模块
            systeMapper.undatasystemodel(systemodel);
        }else {
            //修改首页底部模块网站配置模块
            systeMapper.undataconfigure(systemodel);
        }


    }

    //回显网站配置里的注册设置
    @Override
    public MemberBean Memberecho() {
        return systeMapper.Memberecho();
    }

    @Override
    public void undatamember(MemberBean memberBean) {
        systeMapper.undatamember(memberBean);
    }

    //回显网站配置里的注册协议和积分配置模块
    @Override
    public IntegralprotocolBean queryintegralprotocol() {

        return systeMapper.queryintegralprotocol();
    }

    //修改网站配置里的注册协议和积分配置模块
    @Override
    public void undataIntegral(IntegralprotocolBean integralprotocolBean) {
        if(integralprotocolBean.getZhucexieyi()!=null){
            systeMapper.undatazhecexieyi(integralprotocolBean);
        }else {
            systeMapper.undataIntegral(integralprotocolBean);
        }
    }
}

