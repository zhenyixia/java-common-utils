package com.lyp.seckill.service;

import com.lyp.seckill.pojo.SkGoods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISkGoodsService{

    /**
    *  查询表sk_goods所有信息
    */
    List<SkGoods> findAllSkGoods();

    /**
    *  根据主键id查询表sk_goods信息
    *  @param id
    */
    SkGoods findSkGoodsByid(@Param("id") Long id);

    /**
    *  根据条件查询表sk_goods信息
    *  @param skGoods
    */
    List<SkGoods> findSkGoodsByCondition(SkGoods skGoods);

    /**
    *  根据主键id查询表sk_goods信息
    *  @param id
    */
    Integer deleteSkGoodsByid(@Param("id") Long id);

    /**
    *  根据主键id更新表sk_goods信息
    *  @param skGoods
    */
    Integer updateSkGoodsByid(SkGoods skGoods);

    /**
    *  新增表sk_goods信息
    *  @param skGoods
    */
    Integer addSkGoods(SkGoods skGoods);
}