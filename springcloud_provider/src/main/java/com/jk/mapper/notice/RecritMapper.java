package com.jk.mapper.notice;

import com.jk.model.liangh.notice.NoticeBean;
import com.jk.model.liangh.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Administrator
 */
public interface RecritMapper {

	int queryRecrtCount(PageBean pageBean);

	List<PageBean> queryRecrtpage(@Param("start") int start, @Param("rows") Integer rows, @Param("pageBean") PageBean pageBean);

	List<NoticeBean> findRecrtentList();

	void updateRect(NoticeBean noticeBean);

	void addRect(NoticeBean noticeBean);

	NoticeBean findRecrtentById(Integer id);

	void delRectById(Integer[] id);
}
