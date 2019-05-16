/**
 * Copyright (C), 2019, 金科
 * FileName: AdvertisingController
 * Author:   Administrator
 * Date:     2019/5/16 14:36
 * History:
 */
package com.jk.controller.liangh.advertising;

import com.jk.model.liangh.advertising.AdvertBean;
import com.jk.service.advertising.AdvertisingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈念如心〉<br> 
 * 〈广告管理〉
 *
 * @author liangh
 * @create 2019/5/16
 * @since 1.0.0
 */
@RestController
@CrossOrigin
public class AdvertisingController{

	@Autowired
	private AdvertisingService advertisingService;


	@GetMapping(value="queryAdverList")
	public List<AdvertBean> queryAdverList(){

		return advertisingService.queryAdverList();


	}
}
