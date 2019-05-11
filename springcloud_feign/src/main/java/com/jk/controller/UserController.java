/**
 * Copyright (C), 2019,金科
 * FileName: UserController
 * Author:   HT
 * Date:     2019/5/10 21:53
 * History:
 * HT          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.controller;

import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/5/10
 * @since 1.0.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

}

