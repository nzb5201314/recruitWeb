/**
 * Copyright (C), 2019, 金科
 * FileName: RecritServiceapiImpl
 * Author:   Administrator
 * Date:     2019/5/14 19:25
 * History:
 */
package com.jk.service.notice;

import com.jk.mapper.notice.RecritMapper;
import com.jk.model.liangh.PageBean;
import com.jk.model.liangh.notice.NoticeBean;
import com.jk.service.liangh.notice.RecritServiceapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/**
 * 〈念如心〉<br> 
 * 〈公告实现类〉
 *
 * @author liangh
 * @create 2019/5/14
 * @since 1.0.0
 */
@RestController
public class RecritServiceapiImpl implements RecritServiceapi {

	@Autowired
	private RecritMapper recritMapper;


	/*@Override
	public HashMap<String, Object> queryRecrtentList(Map<String, Object> map) {

		HashMap<String, Object> hashMap = new HashMap<>();

		//查询总条数
		int total=recritMapper.queryRecrtCount((NoticeBean) map.get("noticeBean"));
		//分页查询
		//开始条数
		int start =((int) map.get("page")-1)*(int)map.get("rows");
		List<NoticeBean> list=recritMapper.queryRecrtpage(start,(int) map.get("page"),(NoticeBean) map.get("noticeBean"));
		hashMap.put("total",total);
		hashMap.put("rows",list);

		return hashMap;
	}*/

	@Override
	public HashMap<String, Object> queryRecrtentList(PageBean pageBean) {

		HashMap<String, Object> hashMap = new HashMap<>();


		//查询总条数
		int total=recritMapper.queryRecrtCount(pageBean);

		//分页查询
		//开始条数
		int start=(pageBean.getPage()-1)*pageBean.getRows();

		List<PageBean> list=recritMapper.queryRecrtpage(start,pageBean.getPage(),pageBean);

		hashMap.put("total",total);
		hashMap.put("rows",list);

		return hashMap;
	}

	@Override
	public List<NoticeBean> findRecrtentList() {

		return recritMapper.findRecrtentList();


	}

	@Override
	public void updateRect(NoticeBean noticeBean) {
		recritMapper.updateRect(noticeBean);
	}

	@Override
	public void addRect(NoticeBean noticeBean) {
		recritMapper.addRect(noticeBean);
	}

	@Override
	public NoticeBean findRecrtentById(Integer id) {

		return recritMapper.findRecrtentById(id);
	}

	@Override
	public void delRectById(Integer[] id) {

		recritMapper.delRectById(id);
	}


}
