package com.maya.controller;


import com.maya.service.UserService;
import com.maya.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 * 用户信息表 前端控制器
 * </p>
 *
 * @author anonymous
 * @since 2024-01-16
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

  @Resource
  private UserService userService;

  @GetMapping("/test")
  public Result test() {
    return Result.ok(userService.list());
  }

}

