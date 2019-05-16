package com.jk.service.liangh.explain;

import com.jk.model.liangh.explain.ExplainBean;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface ExplainServiceApi {

	@GetMapping(value = "/queryExpList")
	List<ExplainBean> queryExpList();
}
