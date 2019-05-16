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
import com.jk.model.systemmodel.UserrsdBean;
import com.jk.service.systemservice.SystemService;
import com.jk.utils.EasyuiPage;
import com.jk.utils.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

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

    //网站管理员查询
    @Override
    public EasyuiPage queryuserrs(Integer page, Integer rows) {
        if (page==10000||rows==10000){
            page=null;
            rows=null;
        }

        EasyuiPage easyuiPage = new EasyuiPage();
        HashMap<String, Object> params = new HashMap<>();
        //查询总条数
        int count = systeMapper.findCarCount(params);
        easyuiPage.setTotal(count);
        //查询分页列表
        PageUtil<UserrsdBean> pageUtil = new PageUtil<>(count, page, rows);
        params.put("startIndex", pageUtil.getStartIndex());
        params.put("endIndex", pageUtil.getEndIndex());
        List<UserrsdBean> cars= systeMapper.findCarList(params);
        easyuiPage.setRows(cars);
        return easyuiPage;
    }
    //后台修改用户
    @Override
    public void undatauser(UserrsdBean userrsdBean, Integer id) {
        String password = userrsdBean.getPassword();
        String username= userrsdBean.getUsername();
        String email = userrsdBean.getEmail();
        Integer role_id = userrsdBean.getRole_id();
        if (password!=null){
            //修改密码
            systeMapper.undatapassword(password,id);
        }else {
            //修改用户信息
            systeMapper.undatauser(username,email,role_id,id);
        }
    }
    //后台新增用户
    @Override
    public void adduser(UserrsdBean userrsdBean) {
        systeMapper.adduser(userrsdBean);
    }

    @Override
    public String deleteuserrs(Integer id,Integer userid) {
        //查询自己的权限
       Integer roleid=systeMapper.queryroleid(userid);
        //查询别人的权限
        Integer othersroleid=systeMapper.queryroleidothe(id);

       if (roleid<othersroleid) {
           //删除用户
           systeMapper.deleteuserrs(id);
           return "删除成功";
       }else {
           return "对不起您没有权限";
       }
    }

    //通过前天传过来的账号获取账号的信息
    @Override
    public UserrsdBean findUserInfoByAccount(String username) {
        return systeMapper.findUserInfoByAccount(username);
    }
    //修改最后一次登录的时间和ip地址
    @Override
    public void modifytime(String addr, Integer id) {
        systeMapper.modifytime(addr,id);
    }


}

