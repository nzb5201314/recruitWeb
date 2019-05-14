package com.jk.mapper.personal;

import com.jk.model.personal.PersonalOrderBean;
import com.jk.model.personal.ResumeBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonalMapper {
    long queryshowcount(@Param("personalOrderBean") PersonalOrderBean personalOrderBean);

    List<PersonalOrderBean> queryshow(@Param("start") int start, @Param("rows")Integer rows, @Param("personalOrderBean")PersonalOrderBean personalOrderBean);

    void updatestate(Integer[] ids);

    long queryresumeshowcount(@Param("resumeBean")ResumeBean resumeBean);

    List<PersonalOrderBean> queryresumeshow(@Param("start")int start, @Param("rows")Integer rows, @Param("resumeBean")ResumeBean resumeBean);

    void updateauditstate(Integer[] ids);

    void updatephotoauditstate(Integer[] ids);

    void deleteresume(Integer[] ids);
}
