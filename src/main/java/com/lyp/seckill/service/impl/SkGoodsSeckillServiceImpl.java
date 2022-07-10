package com.lyp.seckill.service.impl;

import com.lyp.seckill.pojo.SkGoodsSeckill;
import com.lyp.seckill.mapper.SkGoodsSeckillMapper;
import com.lyp.seckill.service.ISkGoodsSeckillService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Service
public class SkGoodsSeckillServiceImpl implements ISkGoodsSeckillService {

    @Autowired
    private SkGoodsSeckillMapper skGoodsSeckillMapper;

    /**
    *  查询表sk_goods_seckill所有信息
    */
    @Override
    public List<SkGoodsSeckill> findAllSkGoodsSeckill() { return skGoodsSeckillMapper.findAllSkGoodsSeckill();}

    /**
    *  根据主键id查询表sk_goods_seckill信息
    *  @param id
    */
    @Override
    public SkGoodsSeckill findSkGoodsSeckillByid(@Param("id") Long id) { return skGoodsSeckillMapper.findSkGoodsSeckillByid(id);}

    /**
    *  根据条件查询表sk_goods_seckill信息
    *  @param skGoodsSeckill
    */
    @Override
    public List<SkGoodsSeckill> findSkGoodsSeckillByCondition(SkGoodsSeckill skGoodsSeckill) { return skGoodsSeckillMapper.findSkGoodsSeckillByCondition(skGoodsSeckill);}

    /**
    *  根据主键id查询表sk_goods_seckill信息
    *  @param id
    */
    @Override
    public Integer deleteSkGoodsSeckillByid(@Param("id") Long id) { return skGoodsSeckillMapper.deleteSkGoodsSeckillByid(id);}

    /**
    *  根据主键id更新表sk_goods_seckill信息
    *  @param skGoodsSeckill
    */
    @Override
    public Integer updateSkGoodsSeckillByid(SkGoodsSeckill skGoodsSeckill) { return skGoodsSeckillMapper.updateSkGoodsSeckillByid(skGoodsSeckill);}

    /**
    *  新增表sk_goods_seckill信息
    *  @param skGoodsSeckill
    */
    @Override
    public Integer addSkGoodsSeckill(SkGoodsSeckill skGoodsSeckill) { return skGoodsSeckillMapper.addSkGoodsSeckill(skGoodsSeckill);}

}