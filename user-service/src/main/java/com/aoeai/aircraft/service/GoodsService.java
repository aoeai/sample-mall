package com.aoeai.aircraft.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("mall-service")
public interface GoodsService {

    @RequestMapping(
            method= RequestMethod.GET,
            value="goods/add/{goodsName}",
            consumes="application/json")
    String addGoods(@PathVariable("goodsName") String goodsName);
}
