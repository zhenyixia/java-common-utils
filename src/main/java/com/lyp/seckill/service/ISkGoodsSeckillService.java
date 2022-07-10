package com.lyp.seckill.service;

import com.lyp.seckill.pojo.SkGoodsSeckill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISkGoodsSeckillService{

    /**
    *  查询表sk_goods_seckill所有信息
    */
    List<SkGoodsSeckill> findAllSkGoodsSeckill();

    /**
    *  根据主键id查询表sk_goods_seckill信息
    *  @param id
    */
    SkGoodsSeckill findSkGoodsSeckillByid(@Param("id") Long id);

    /**
    *  根据条件查询表sk_goods_seckill信息
    *  @param skGoodsSeckill
    */
    List<SkGoodsSeckill> findSkGoodsSeckillByCondition(SkGoodsSeckill skGoodsSeckill);

    /**
    *  根据主键id查询表sk_goods_seckill信息
    *  @param id
    */
    Integer deleteSkGoodsSeckillByid(@Param("id") Long id);

    /**
    *  根据主键id更新表sk_goods_seckill信息
    *  @param skGoodsSeckill
    */
    Integer updateSkGoodsSeckillByid(SkGoodsSeckill skGoodsSeckill);

    /**
    *  新增表sk_goods_seckill信息
    *  @param skGoodsSeckill
    */
    Integer addSkGoodsSeckill(SkGoodsSeckill skGoodsSeckill);
}