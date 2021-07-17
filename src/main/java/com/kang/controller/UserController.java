package com.kang.controller;


import com.kang.common.lang.Result;
import com.kang.entity.User;
import com.kang.service.UserService;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Kanseer
 * @since 2021-04-05
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/{id}")
    public Result test(@PathVariable("id") Long id){
        System.out.println("-text-");
        User user = userService.getById(id);
        return Result.succ(200,"操作成功!",user);
    }

    @PostMapping("/save")
    public Object testUser(@Validated @RequestBody User user){
        return Result.succ(user);
    }
}
