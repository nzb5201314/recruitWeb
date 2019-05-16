package com.jk.service.liangh.notice;

import com.jk.model.liangh.PageBean;
import com.jk.model.liangh.notice.NoticeBean;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

public interface RecritServiceapi {
//分页查询
	/*@GetMapping(value = "/queryRecrtentList")
	HashMap<String, Object> queryRecrtentList(@RequestBody Map<String, Object> map);*/
	@GetMapping(value = "/queryRecrtentList")
	HashMap<String, Object> queryRecrtentList(@RequestBody PageBean pageBean);
//对象查询
	@GetMapping(value = "/findRecrtentList")
	List<NoticeBean> findRecrtentList();

//修改
	@RequestMapping(value = "addRect",method = RequestMethod.PUT)
	void updateRect(@RequestBody NoticeBean noticeBean);
//新增
	@RequestMapping(value = "addRect",method = RequestMethod.POST)
	void addRect(@RequestBody NoticeBean noticeBean);
//条件查询
@RequestMapping(value = "/findRecrtentById", method = RequestMethod.POST)
	NoticeBean findRecrtentById(@RequestParam("id") Integer id);

//删除
	@DeleteMapping(value = "delRectById")
	void delRectById(@RequestParam("id") Integer[] id);
}
