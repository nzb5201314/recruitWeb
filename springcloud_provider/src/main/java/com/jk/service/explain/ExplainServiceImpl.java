/**
 * Copyright (C), 2019, 金科
 * FileName: ExplainServiceImpl
 * Author:   Administrator
 * Date:     2019/5/16 10:45
 * History:
 */
package com.jk.service.explain;

import com.jk.mapper.explain.ExplaMapper;
import com.jk.model.liangh.explain.ExplainBean;
import com.jk.service.liangh.explain.ExplainServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈念如心〉<br> 
 * 〈实现类〉
 *
 * @author liangh
 * @create 2019/5/16
 * @since 1.0.0
 */
@RestController
public class ExplainServiceImpl implements ExplainServiceApi {

	@Autowired
	private ExplaMapper explaMapper;

	@Override
	public List<ExplainBean> queryExpList() {

		return explaMapper.queryExpList();
	}
}
