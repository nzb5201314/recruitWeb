/**
 * Copyright (C), 2019, 金科
 * FileName: AdvertisingService
 * Author:   Administrator
 * Date:     2019/5/16 14:47
 * History:
 */
package com.jk.service.advertising;

import com.jk.mapper.advertising.AdvertisingMapper;
import com.jk.model.liangh.advertising.AdvertBean;
import com.jk.service.liangh.advertising.AdvertisingServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈念如心〉<br> 
 * 〈广告实现类〉
 *
 * @author liangh
 * @create 2019/5/16
 * @since 1.0.0
 */
@RestController
public class AdvertisingService implements AdvertisingServiceApi {

	@Autowired
	private AdvertisingMapper advertisingMapper;

 	@Override
	public List<AdvertBean> queryAdverList() {

		return advertisingMapper.queryAdverList();
	}
}
