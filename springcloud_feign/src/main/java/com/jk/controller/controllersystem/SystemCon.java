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

import com.jk.model.systemmodel.*;
import com.jk.service.systemservice.SystemService;
import com.jk.utils.EasyuiPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

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

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private MongoTemplate mongoTemplate;



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


    /**
     * 网站管理员查询
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("queryuserrs")
    @ResponseBody
    public EasyuiPage queryuserrs(Integer page, Integer rows){
        if (page==null || rows==null){
            page=10000;
            rows=10000;

        }
        return systemService.queryuserrs(page,rows);

    }

    /**
     *后台新增或者修改用户
     * @param integralprotocolBean
     * @return
     */
    @RequestMapping("adduserrs")
    @ResponseBody
    public Boolean adduser(UserrsdBean userrsdBean,Integer id){
        try {
            if (userrsdBean.getId()!=null) {
                systemService.undatauser(userrsdBean,id);
            }else {
                systemService.adduser(userrsdBean);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 删除后端用户
     * @param id
     * @return
     */
    @RequestMapping("deleteuserrs")
    @ResponseBody
    public String deleteuserrs(Integer id){

        UserrsdBean userBean = (UserrsdBean) redisTemplate.opsForValue().get("userBean");
        Integer userid = userBean.getId();
        return systemService.deleteuserrs(id,userid);
    }

    /**
     * 登录
     * @param userrsdBean
     * @return
     */
    @RequestMapping("backstagelogin")
    @ResponseBody
    public HashMap<String, Object> login(UserrsdBean userrsdBean,HttpServletRequest request){
        HashMap<String, Object> result = new HashMap<>();
        //通过前天传过来的账号获取账号的信息
        UserrsdBean userInfo = systemService.findUserInfoByAccount(userrsdBean.getUsername());
        if (userInfo == null) {
            result.put("code", 2);
            result.put("msg", "账号或密码错误");
            return result;
        }
        //判断前台传过来的密码是否和数据库的一致（注意：前台的密码需要加密后再比较）
        String password = userrsdBean.getPassword();
        if (!userInfo.getPassword().equals(password)) {
            result.put("code", 3);
            result.put("msg", "账号或密码错误");
            return result;
        }
        //获取登录IP地址
        String addr=null;
        if (request.getHeader("x-forwarded-for") == null) {
            addr = request.getRemoteAddr();
        }else {
         addr = request.getHeader("x-forwarded-for");
        }
        //修改最后一次登录的时间和ip地址
        Integer id = userInfo.getId();
        systemService.modifytime(addr,id);
        //将用户信息存入到redis共享
        String key="userBean";
        redisTemplate.opsForValue().set(key, userInfo);
        redisTemplate.expire(key, 30, TimeUnit.MINUTES);
        //以上步骤全部成功则返回成功
        result.put("code", 0);
        result.put("msg", "登录成功");
        //添加登录日志（mongodb）
        SimpleDateFormat   sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        JournalBean journalBean =new JournalBean();
        journalBean.setLogid(userInfo.getId());
        journalBean.setLogip(addr);
        journalBean.setLogdata(sdf.format(new Date()));
        journalBean.setOperater(userInfo.getUsername());
        String  request_url=request.getServletPath();
        journalBean.setLogurl(request_url);
        mongoTemplate.save(journalBean,"h_journal");
        return result;
    }

    /**
     * 日志查询
     * @param id
     * @return
     */
    @RequestMapping("queryJournalid")
    @ResponseBody
    public List<JournalBean> queryJournalid (Integer id){

        Query query =new Query();
        query.addCriteria(Criteria.where("logid").in(id));
        List<JournalBean> findlist = mongoTemplate.find(query, JournalBean.class);

        return findlist;
    }






}

