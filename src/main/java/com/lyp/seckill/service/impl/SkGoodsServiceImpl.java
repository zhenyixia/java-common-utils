package com.lyp.seckill.service.impl;

import com.lyp.seckill.pojo.SkGoods;
import com.lyp.seckill.mapper.SkGoodsMapper;
import com.lyp.seckill.service.ISkGoodsService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Service
public class SkGoodsServiceImpl implements ISkGoodsService {

    @Autowired
    private SkGoodsMapper skGoodsMapper;

    /**
    *  查询表sk_goods所有信息
    */
    @Override
    public List<SkGoods> findAllSkGoods() { return skGoodsMapper.findAllSkGoods();}

    /**
    *  根据主键id查询表sk_goods信息
    *  @param id
    */
    @Override
    public SkGoods findSkGoodsByid(@Param("id") Long id) { return skGoodsMapper.findSkGoodsByid(id);}

    /**
    *  根据条件查询表sk_goods信息
    *  @param skGoods
    */
    @Override
    public List<SkGoods> findSkGoodsByCondition(SkGoods skGoods) { return skGoodsMapper.findSkGoodsByCondition(skGoods);}

    /**
    *  根据主键id查询表sk_goods信息
    *  @param id
    */
    @Override
    public Integer deleteSkGoodsByid(@Param("id") Long id) { return skGoodsMapper.deleteSkGoodsByid(id);}

    /**
    *  根据主键id更新表sk_goods信息
    *  @param skGoods
    */
    @Override
    public Integer updateSkGoodsByid(SkGoods skGoods) { return skGoodsMapper.updateSkGoodsByid(skGoods);}

    /**
    *  新增表sk_goods信息
    *  @param skGoods
    */
    @Override
    public Integer addSkGoods(SkGoods skGoods) { return skGoodsMapper.addSkGoods(skGoods);}

}