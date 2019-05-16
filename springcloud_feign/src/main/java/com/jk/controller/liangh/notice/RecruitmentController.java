/**
 * Copyright (C), 2019, 金科
 * FileName: RecruitmentController
 * Author:   Administrator
 * Date:     2019/5/14 17:02
 * History:
 */
package com.jk.controller.liangh.notice;

import com.jk.model.liangh.notice.NoticeBean;
import com.jk.model.liangh.PageBean;
import com.jk.service.notice.RecritService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * 〈念如心〉<br> 
 * 〈公告展示〉
 *
 * @author liangh
 * @create 2019/5/14
 * @since 1.0.0
 */
@CrossOrigin//跨域转换json
@RestController
public class RecruitmentController {

	@Autowired
	private RecritService recritService;

	/**
	 * 分页查询
	 * @param pageBean
	 * @return
	 */
	@GetMapping(value = "/queryRecrtentList")
	public HashMap<String, Object> queryRecrtentList(PageBean pageBean){

		return recritService.queryRecrtentList(pageBean);
		/*Map<String, Object> map = new HashMap<>();
		map.put("page",page);
		map.put("rows",rows);
		map.put("noticeBean",noticeBean);
		return recritService.queryRecrtentList(map);*/

	}

	/***
	 * 条件查询
	 * @return
	 */

	@RequestMapping(value = "/findRecrtentById" , method = RequestMethod.POST)
	public NoticeBean findRecrtentById(Integer id){

		NoticeBean  ll=recritService.findRecrtentById(id);
		System.out.println(ll+"sssssssssssssssssss");
		return 	ll;


	}
	/***
	 * 对象查询
	 * @return
	 */

	@GetMapping(value = "/findRecrtentList")
	public List<NoticeBean> findRecrtentList(){

		return 	recritService.findRecrtentList();


	}


	/**
	 * 新增和修改
	 * @param noticeBean
	 */

	@RequestMapping("addRect")
	public Boolean addRect(NoticeBean noticeBean){

		try {

			if(noticeBean.getId()!=null){
				recritService.updateRect(noticeBean);
			}else{
				recritService.addRect(noticeBean);
			}
			return true;

		}catch (Exception e){

			e.printStackTrace();

			return false;

		}


	}


	@DeleteMapping(value = "delRectById")
	public boolean delRectById(Integer[] id){
		try {
			recritService.delRectById(id);

			return true;
		}catch (Exception e){
			e.printStackTrace();
			return false;

		}

	}
}
