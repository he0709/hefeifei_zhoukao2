package com.hefeifei.service;

import com.hefeifei.entity.WeiXiu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MyService {
    List<WeiXiu> list(WeiXiu weiXiu);
    int add(WeiXiu weiXiu);
    int del(String ids);
    WeiXiu selectById(int id);
    List<WeiXiu> test();
}
