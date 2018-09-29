package com.aoeai.mall.service.impl;

import com.aoeai.mall.mapper.MallGoodsMapper;
import com.aoeai.mall.model.MallGoods;
import com.aoeai.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private MallGoodsMapper mallGoodsMapper;

    @Override
    public int addGoods(MallGoods goods) {
        Date date = new Date();
        goods.setAddTime(date);
        goods.setUpdateTime(goods.getAddTime());
        return mallGoodsMapper.insertSelective(goods);
    }
}
