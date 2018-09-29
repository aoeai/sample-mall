package com.aoeai.mall.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "`mall_goods`")
public class MallGoods {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 商品名称
     */
    @Column(name = "`name`")
    private String name;

    @Column(name = "`price`")
    private BigDecimal price;

    /**
     * 添加时间
     */
    @Column(name = "`add_time`")
    private Date addTime;

    /**
     * 更新时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;

    /**
     * 逻辑删除 0 已删除；1 正常
     */
    @Column(name = "`is_delete`")
    private Byte isDelete;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商品名称
     *
     * @return name - 商品名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置商品名称
     *
     * @param name 商品名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取添加时间
     *
     * @return add_time - 添加时间
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * 设置添加时间
     *
     * @param addTime 添加时间
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取逻辑删除 0 已删除；1 正常
     *
     * @return is_delete - 逻辑删除 0 已删除；1 正常
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 设置逻辑删除 0 已删除；1 正常
     *
     * @param isDelete 逻辑删除 0 已删除；1 正常
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}