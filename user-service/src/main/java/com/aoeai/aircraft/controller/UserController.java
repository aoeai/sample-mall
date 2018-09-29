package com.aoeai.aircraft.controller;

import com.aoeai.aircraft.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="user")
public class UserController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value="addGoods/{goodsName}",method = RequestMethod.GET)
    public String addGoodsTest(@PathVariable("goodsName") String goodsName) {

        return "用户操作结果 " + goodsService.addGoods(goodsName);
    }


}
