/**
 * Copyright (C), 2019,金科
 * FileName: SysteMapper
 * Author:   HT
 * Date:     2019/5/13 21:06
 * History:
 * HT          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.mapper.systemapper;

import com.jk.model.systemmodel.IntegralprotocolBean;
import com.jk.model.systemmodel.MemberBean;
import com.jk.model.systemmodel.Systemodel;
import com.jk.model.systemmodel.UserrsdBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
public interface SysteMapper {

    //回显网站配置里的网站配置和首页底部配置模块
    @Select("SELECT * FROM h_syste ")
    Systemodel huixian();

    //修改首页底部模块
    @Update("update h_syste set weixinimg= #{weixinimg},indexbottominfo=#{indexbottominfo},indexbottomwx=#{indexbottomwx}")
    void undatasystemodel(Systemodel systemodel);

    //修改首页底部模块网站配置模块
    @Update("UPDATE h_syste SET address=#{address},bootomtel=#{bootomtel},bottomother=#{bottomother},closereason=#{closereason},contactemail=#{contactemail},hylogo=#{hylogo},icp=#{icp},isclose=#{isclose},qtlogo=#{qtlogo},sitename=#{sitename},statistics=#{statistics},sylogo=#{sylogo},toptel=#{toptel}")
    void undataconfigure(Systemodel systemodel);

    //回显网站配置里的注册设置
    @Select("SELECT * FROM h_member ")
    MemberBean Memberecho();

    //修改网站配置里的注册设置
    @Update("UPDATE h_member SET closereg=#{closereg},emailregprefix=#{emailregprefix},registerpasswordopen=#{registerpasswordopen},regpasswordtpye=#{regpasswordtpye},regpasswordtpyeinput=#{regpasswordtpyeinput},regprefix=#{regprefix}")
    void undatamember(MemberBean memberBean);

    //回显网站配置里的注册协议和积分配置模块
    @Select("SELECT * FROM h_xieyijifen")
    IntegralprotocolBean queryintegralprotocol();

    //修改网站配置里的注册协议
    @Update("UPDATE h_xieyijifen SET zhucexieyi=#{zhucexieyi}")
    void undatazhecexieyi(IntegralprotocolBean integralprotocolBean);

    //修改网站配置里的积分配置模块
    @Update("UPDATE h_xieyijifen SET substitutename=#{substitutename},integralclassifier=#{integralclassifier}")
    void undataIntegral(IntegralprotocolBean integralprotocolBean);

    //网站管理员查询总条数
    @Select("SELECT COUNT(*)  FROM qs_admin a LEFT JOIN qs_admin_role r ON a.role_id=r.id")
    int findCarCount(HashMap<String, Object> params);

    //网站管理员查询分页列表
    @Select("SELECT *  FROM qs_admin a LEFT JOIN qs_admin_role r ON a.role_id=r.id LIMIT #{startIndex,jdbcType=NUMERIC},#{endIndex,jdbcType=NUMERIC}")
    List<UserrsdBean> findCarList(HashMap<String, Object> params);


    //修改后端用户
    @Update("UPDATE qs_admin SET username=#{username},email=#{email},role_id=#{role_id} WHERE id=#{id}")
    void undatauser(String username, String email, Integer role_id, Integer id);

    //新增后端用户
    @Insert("INSERT INTO qs_admin (username,email,password,role_id,add_time) VALUES (#{username},#{email},#{password},#{role_id},SYSDATE())")
    void adduser(UserrsdBean userrsdBean);

    //修改后端用户
    @Update("UPDATE qs_admin SET password=#{password} WHERE id=#{id}")
    void undatapassword(String password, Integer id);
    //查询权限
    @Select("SELECT role_id FROM qs_admin  WHERE id=#{id}")
    void queryroleid(Integer id);
    //通过前天传过来的账号获取账号的信息
    @Select("select * from qs_admin  where  username = #{username}")
    UserrsdBean findUserInfoByAccount(String username);
}

