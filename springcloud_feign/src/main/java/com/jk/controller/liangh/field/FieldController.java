/**
 * Copyright (C), 2019, 金科
 * FileName: FieldBean
 * Author:   Administrator
 * Date:     2019/5/16 15:31
 * History:
 */
package com.jk.controller.liangh.field;

import com.jk.model.liangh.advertising.CategoryBean;
import com.jk.service.field.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈念如心〉<br> 
 * 〈广告栏位〉
 *
 * @author liangh
 * @create 2019/5/16
 * @since 1.0.0
 */
@RestController
@CrossOrigin
public class FieldController {

	@Autowired
	private FieldService fieldService;

    @GetMapping(value="queryCateList")
	public List<CategoryBean> queryCateList(){

    	return fieldService.queryCateList();
    }

}
