package com.hefeifei.service;

import com.hefeifei.entity.WeiXiu;
import com.hefeifei.mapper.JPAMapper;
import com.hefeifei.mapper.WeiXiuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImpl implements MyService{
    @Autowired
    private WeiXiuMapper weiXiuMapper;
    @Autowired
    private JPAMapper jpaMapper;

    @Override
    public List<WeiXiu> list(WeiXiu weiXiu) {
        return weiXiuMapper.list(weiXiu);
    }

    @Override
    public int add(WeiXiu weiXiu) {
        System.out.println(weiXiu.getId());
        if(weiXiu.getId()==null){
          return  weiXiuMapper.add(weiXiu);
        }
        return weiXiuMapper.upd(weiXiu);
    }

    @Override
    public int del(String ids) {

        return weiXiuMapper.del(ids);
    }

    @Override
    public WeiXiu selectById(int id) {
        return weiXiuMapper.selectById(id);
    }

    @Override
    public List<WeiXiu> test() {
        return jpaMapper.findAll();
    }
}
