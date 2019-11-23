package com.hefeifei.mapper;

import com.hefeifei.entity.WeiXiu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WeiXiuMapper {
    List<WeiXiu> list(WeiXiu weiXiu);
    int add(WeiXiu weiXiu);
    int upd(WeiXiu weiXiu);
    int del(@Param("ids") String ids);
    WeiXiu selectById(@Param("id") int id);
}
