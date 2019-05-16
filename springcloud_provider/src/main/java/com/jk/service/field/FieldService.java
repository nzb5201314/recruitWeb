/**
 * Copyright (C), 2019, 金科
 * FileName: FieldService
 * Author:   Administrator
 * Date:     2019/5/16 15:40
 * History:
 */
package com.jk.service.field;

import com.jk.mapper.field.FieldCateMapper;
import com.jk.model.liangh.advertising.CategoryBean;
import com.jk.service.liangh.field.FieldServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈念如心〉<br> 
 * 〈栏位实现类〉
 *
 * @author liangh
 * @create 2019/5/16
 * @since 1.0.0
 */
@RestController
public class FieldService implements FieldServiceApi {

	@Autowired
	private FieldCateMapper fieldCateMapper;
	@Override
	public List<CategoryBean> queryCateList() {

		return fieldCateMapper.queryCateList();

	}
}
