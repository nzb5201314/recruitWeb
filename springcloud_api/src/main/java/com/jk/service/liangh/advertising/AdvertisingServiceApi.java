package com.jk.service.liangh.advertising;

import com.jk.model.liangh.advertising.AdvertBean;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface AdvertisingServiceApi {

	@GetMapping(value="queryAdverList")
	List<AdvertBean> queryAdverList();
}
