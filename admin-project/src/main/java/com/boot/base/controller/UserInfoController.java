package com.boot.base.controller;


import com.boot.base.entity.UserInfo;
import com.boot.base.service.UserInfoService;
import com.boot.base.util.RedisUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 贾海军
 * @since 2021-12-28
 */
@Controller
@RequestMapping("/user-info")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;
    @Resource
    private RedisUtil redisUtil;

    @GetMapping("/list")
    @ApiOperation("查询所有用户")
    @ResponseBody
    public String showList(){
        List<UserInfo> list = userInfoService.list();
        return list.toString();
    }

    @GetMapping("/queryOne")
    @ApiOperation("查询用户")
    @ResponseBody
    public String queryOne(String id){
        Object object = redisUtil.get(id);
        if(object != null){
            ObjectMapper objectMapper = new ObjectMapper();
            UserInfo userInfo = objectMapper.convertValue(object,UserInfo.class);
            return  userInfo.toString();
        }else {
            UserInfo userInfo = userInfoService.getById(Integer.parseInt(id));
            redisUtil.set(id,userInfo,3000);
            return userInfo.toString();
        }
    }

    @GetMapping("/add")
    @ApiOperation("添加或编辑用户")
    @ResponseBody
    public String addUser(UserInfo userInfo){
        if(userInfo.getId() == null){
            if(userInfoService.saveOrUpdate(userInfo)){
                return "添加成功!";
            }
            return "添加失败！";
        }else {
            if(userInfoService.saveOrUpdate(userInfo)){
                return "编辑成功!";
            }
            return "编辑失败！";
        }
    }
    @GetMapping("/del")
    @ApiOperation("删除用户")
    @ResponseBody
    public String delUser(String id){
        if(userInfoService.removeById(Integer.parseInt(id))){
            return "删除成功！";
        }
        return "删除失败！";
    }

}

