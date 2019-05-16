package com.jk.mapper.personal;

import com.jk.model.personal.MembersBean;
import com.jk.model.personal.PersonalOrderBean;
import com.jk.model.personal.ResumeBean;
import com.jk.model.personal.UntyingBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonalMapper {
    long queryshowcount(@Param("personalOrderBean") PersonalOrderBean personalOrderBean);

    List<PersonalOrderBean> queryshow(@Param("start") int start,@Param("personalOrderBean")PersonalOrderBean personalOrderBean);

    void updatestate(Integer[] ids);

    long queryresumeshowcount(@Param("resumeBean")ResumeBean resumeBean);

    List<PersonalOrderBean> queryresumeshow(@Param("start")int start,@Param("resumeBean")ResumeBean resumeBean);

    void updateauditstate(Integer[] ids);

    void updatephotoauditstate(Integer[] ids);

    void deleteresume(Integer[] ids);

    long querymembersshowcount(@Param("membersBean")MembersBean membersBean);

    List<PersonalOrderBean> querymembersshow(@Param("start")int start, @Param("membersBean")MembersBean membersBean);

    void membersadd(MembersBean membersBean);

    void deletemembers(Integer[] ids);

    long queryuntyingshowcount(@Param("untyingBean")UntyingBean untyingBean);

    List<PersonalOrderBean> queryuntyingshow(@Param("start")int start, @Param("untyingBean")UntyingBean untyingBean);

    void untyingupdate(UntyingBean untyingBean);

    void deleteuntying(Integer[] ids);

    long queryresumephotoshowcount(@Param("resumeBean")ResumeBean resumeBean);

    List<PersonalOrderBean> queryresumephotoshow(@Param("start")int start, @Param("resumeBean")ResumeBean resumeBean);

    UntyingBean untyinghuixian(Integer untyingid);

    long queryfujianshowcount(@Param("resumeBean")ResumeBean resumeBean);

    List<PersonalOrderBean> queryfujianshow(@Param("start")int start, @Param("resumeBean")ResumeBean resumeBean);

    void updatefujianstate(Integer[] ids);
}
