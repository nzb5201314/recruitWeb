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

import com.jk.model.systemmodel.IntegralprotocolBean;
import com.jk.model.systemmodel.MemberBean;
import com.jk.model.systemmodel.Systemodel;
import com.jk.model.systemmodel.UserrsdBean;
import com.jk.utils.EasyuiPage;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value = "/Memberecho",method = RequestMethod.GET)
    MemberBean Memberecho();

    //修改网站配置里的网站配置和首页底部配置模块
    @RequestMapping(value = "/undatamember",method = RequestMethod.PUT)
    void undatamember(@RequestBody MemberBean memberBean);

    //回显网站配置里的注册协议和积分配置模块
    @RequestMapping(value = "/queryintegralprotocol",method = RequestMethod.GET)
    IntegralprotocolBean queryintegralprotocol();

    //修改网站配置里的注册协议和积分配置模块
    @RequestMapping(value = "/undataIntegral",method = RequestMethod.PUT)
    void undataIntegral(@RequestBody IntegralprotocolBean integralprotocolBean);

    //网站管理员查询
    @RequestMapping(value = "/queryuserrs",method = RequestMethod.GET)
    EasyuiPage queryuserrs(@RequestParam("page")Integer page,@RequestParam("rows")Integer rows);

    //后台修改用户
    @RequestMapping(value = "/adduserrs",method = RequestMethod.PUT)
    void undatauser(@RequestBody UserrsdBean  userrsdBean, @RequestParam("userid")Integer id);

    //后台新增用户
    @RequestMapping(value = "/adduserrs",method = RequestMethod.POST)
    void adduser(@RequestBody UserrsdBean userrsdBean);

    //删除后端用户
    @RequestMapping(value = "/adduserrs",method = RequestMethod.DELETE)
    String deleteuserrs(@RequestParam("id")Integer id,@RequestParam("userid")Integer userid);
    //通过前天传过来的账号获取账号的信息
    @RequestMapping(value = "/backstagelogin",method = RequestMethod.GET)
    UserrsdBean findUserInfoByAccount(@RequestParam("username")String username);

    //修改最后一次登录的时间和ip地址
    @RequestMapping(value = "/backstagelogin",method = RequestMethod.PUT)
    void modifytime(@RequestParam("addr")String addr,@RequestParam("id") Integer id);


}


