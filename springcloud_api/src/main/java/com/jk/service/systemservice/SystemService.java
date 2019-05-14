/**
 * Copyright (C), 2019,金科
 * FileName: SystemService
 * Author:   HT
 * Date:     2019/5/13 20:51
 * History:
 * HT          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.systemservice;

import com.jk.model.systemmodel.MemberBean;
import com.jk.model.systemmodel.Systemodel;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/13
 * @since 1.0.0
 */
public interface SystemService {
    //回显网站配置里的网站配置和首页底部配置模块
    @RequestMapping(value = "/huixian",method = RequestMethod.GET)
    Systemodel huixian();

    //修改网站配置里的网站配置和首页底部配置模块
    @RequestMapping(value = "/undatasystemodel",method = RequestMethod.PUT)
    void undatamenu(@RequestBody Systemodel systemodel);
    //回显网站配置里的注册设置
    @RequestMapping(value = "/Memberecho",method = RequestMethod.PUT)
    MemberBean Memberecho();
    //修改网站配置里的网站配置和首页底部配置模块
    @RequestMapping(value = "/undatamember",method = RequestMethod.PUT)
    void undatamember(@RequestBody MemberBean memberBean);
}


