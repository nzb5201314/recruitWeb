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

import com.jk.model.systemmodel.MemberBean;
import com.jk.model.systemmodel.Systemodel;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
    @Select("SELECT * FROM h_member ")
    MemberBean Memberecho();
    @Update("UPDATE h_member SET closereg=#{closereg},emailregprefix=#{emailregprefix},registerpasswordopen=#{registerpasswordopen},regpasswordtpye=#{regpasswordtpye},regpasswordtpyeinput=#{regpasswordtpyeinput},regprefix=#{regprefix}")
    void undatamember(MemberBean memberBean);
}

