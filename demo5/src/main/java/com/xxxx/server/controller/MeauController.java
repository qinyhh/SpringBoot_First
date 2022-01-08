package com.xxxx.server.controller;

import com.xxxx.server.pojo.Menu;
import com.xxxx.server.pojo.RespBean;
import com.xxxx.server.service.IMenuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 通过用户id查询菜单
 * @Author qinyh
 * @date 2022/1/6
 */
@RestController
@RequestMapping("/system/cfg")
public class MeauController {

    @Autowired
    private IMenuService iMenuService;

    @ApiOperation(value = "通过用户id查询菜单")
    @GetMapping("/menu")
    public List<Menu> getMenuByAdminid(){
        return iMenuService.getMenusByAdminId();
    }

}
