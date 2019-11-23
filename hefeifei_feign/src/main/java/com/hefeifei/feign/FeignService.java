package com.hefeifei.feign;

import com.hefeifei.entity.WeiXiu;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient("weixiu")
public interface FeignService {
    @RequestMapping("list")
    List<WeiXiu> list(@RequestBody WeiXiu weiXiu);
    @RequestMapping("add")
    int add(@RequestBody WeiXiu weiXiu);
    @RequestMapping("del")
    int del(@RequestParam("ids") String ids);
    @RequestMapping("selectById")
    WeiXiu selectById(@RequestParam("id") int id);

}
