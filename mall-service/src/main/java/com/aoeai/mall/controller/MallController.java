package com.aoeai.mall.controller;

import com.aoeai.mall.model.MallGoods;
import com.aoeai.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="goods")
public class MallController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value="add/{goodsName}",method = RequestMethod.GET)
    public String addGoods(@PathVariable("goodsName") String goodsName){
        MallGoods goods = new MallGoods();
        goods.setName(goodsName);

        return "结果" + goodsService.addGoods(goods);
    }
}
