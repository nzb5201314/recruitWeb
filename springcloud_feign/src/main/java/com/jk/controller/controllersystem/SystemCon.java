/**
 * Copyright (C), 2019,金科
 * FileName: SystemCon
 * Author:   HT
 * Date:     2019/5/13 20:45
 * History:
 * HT          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller.controllersystem;

import com.jk.model.systemmodel.IntegralprotocolBean;
import com.jk.model.systemmodel.MemberBean;
import com.jk.model.systemmodel.Systemodel;
import com.jk.service.systemservice.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
@CrossOrigin
@Controller
public class SystemCon {
    @Autowired
    private SystemService systemService;

    /**
     *  回显网站配置里的网站配置和首页底部配置模块
     * @param id
     * @return Systemodel
     */
    @RequestMapping(value = "/huixian")
    @ResponseBody
    public Systemodel huixian(){

        return systemService.huixian();

    }

    /**
     * 修改网站配置里的网站配置和首页底部配置模块
     * @param systemodel
     * @return
     */
    @RequestMapping("undatasystemodel")
    @ResponseBody
    public Boolean addrolemenu(Systemodel systemodel){
        try {

            systemService.undatamenu(systemodel);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 回显网站配置里的注册设置
     * @return
     */
    @RequestMapping(value = "/memberecho")
    @ResponseBody
    public MemberBean Memberecho(){

        MemberBean memberecho = systemService.Memberecho();
        return memberecho;

    }

    /**
     * 修改网站配置里的注册设置
     * @param memberBean
     * @return true
     */
    @RequestMapping("undatamember")
    @ResponseBody
    public Boolean undatamember(MemberBean memberBean){
        try {

            systemService.undatamember(memberBean);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 回显网站配置里的注册协议和积分配置模块
     * @return
     */
    @RequestMapping(value = "/queryintegralprotocol")
    @ResponseBody
    public IntegralprotocolBean queryintegralprotocol(){

        return systemService.queryintegralprotocol();

    }

    /**
     * 修改网站配置里的注册协议和积分配置模块
     * @param integralprotocolBean
     * @return
     */
    @RequestMapping("undataIntegral")
    @ResponseBody
    public Boolean undataIntegral (IntegralprotocolBean integralprotocolBean){
        try {

            systemService.undataIntegral(integralprotocolBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }





}

