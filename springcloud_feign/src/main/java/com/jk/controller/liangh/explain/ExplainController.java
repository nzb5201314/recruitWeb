/**
 * Copyright (C), 2019, 金科
 * FileName: ExplainBean
 * Author:   Administrator
 * Date:     2019/5/16 10:39
 * History:
 */
package com.jk.controller.liangh.explain;

import com.jk.model.liangh.explain.ExplainBean;
import com.jk.service.explain.ExplainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈念如心〉<br> 
 * 〈说明页〉
 *
 * @author liangh
 * @create 2019/5/16
 * @since 1.0.0
 */
@RestController
@CrossOrigin
public class ExplainController {

	@Autowired
	private ExplainService explainService;


	/***
	 * 对象查询
	 * @return
	 */

	@GetMapping(value = "/queryExpList")
	public List<ExplainBean> queryExpList(){

		return 	explainService.queryExpList();


	}
}
