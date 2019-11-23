package com.hefeifei.controller;

import com.hefeifei.entity.WeiXiu;
import com.hefeifei.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class MyController {
    @Autowired
    private MyService service;
    //列表
    @RequestMapping("list")
    public List list(@RequestBody WeiXiu weiXiu){
        System.out.println(weiXiu);
        return service.list(weiXiu);
    }
    //添加
    @RequestMapping("add")
    public int add(@RequestBody WeiXiu weiXiu){
        return service.add(weiXiu);
    }
    //删除
    @RequestMapping("del")
    public int del(@RequestParam String ids){
        return service.del(ids);
    }
    //查询根据id
    @RequestMapping("selectById")
    public WeiXiu selectById(@RequestParam int id){
        return service.selectById(id);
    }
}
