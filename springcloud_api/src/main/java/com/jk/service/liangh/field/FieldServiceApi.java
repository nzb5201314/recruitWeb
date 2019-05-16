package com.jk.service.liangh.field;

import com.jk.model.liangh.advertising.CategoryBean;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface FieldServiceApi {

	@GetMapping(value="queryCateList")
	List<CategoryBean> queryCateList();
}
