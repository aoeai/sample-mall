package com.aoeai.mall.service;

import com.aoeai.mall.model.MallGoods;

/**
 * 商品服务
 */
public interface GoodsService {

    /**
     * 添加商品
     * @param goods
     * @return
     */
    int addGoods(MallGoods goods);
}
