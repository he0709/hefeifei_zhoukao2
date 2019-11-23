package com.hefeifei.controller;

import com.hefeifei.entity.WeiXiu;
import com.hefeifei.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class FeignController {
    @Autowired
    private FeignService feignService;
    @RequestMapping("list")
    public List list(WeiXiu weiXiu){
        System.out.println(weiXiu);
        return feignService.list(weiXiu);
    }
    @RequestMapping("add")
    public int add(@RequestBody WeiXiu weiXiu){
        return feignService.add(weiXiu);
    }
    @RequestMapping("del")
    public int del(String ids){
        return feignService.del(ids);
    }
    @RequestMapping("selectById")
    public WeiXiu selectById(int id){
        return feignService.selectById(id);
    }
}
