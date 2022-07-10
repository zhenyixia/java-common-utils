package com.lyp.seckill.service.impl;

import com.lyp.seckill.pojo.SkOrder;
import com.lyp.seckill.mapper.SkOrderMapper;
import com.lyp.seckill.service.ISkOrderService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Service
public class SkOrderServiceImpl implements ISkOrderService {

    @Autowired
    private SkOrderMapper skOrderMapper;

    /**
    *  查询表sk_order所有信息
    */
    @Override
    public List<SkOrder> findAllSkOrder() { return skOrderMapper.findAllSkOrder();}

    /**
    *  根据主键id查询表sk_order信息
    *  @param id
    */
    @Override
    public SkOrder findSkOrderByid(@Param("id") Long id) { return skOrderMapper.findSkOrderByid(id);}

    /**
    *  根据条件查询表sk_order信息
    *  @param skOrder
    */
    @Override
    public List<SkOrder> findSkOrderByCondition(SkOrder skOrder) { return skOrderMapper.findSkOrderByCondition(skOrder);}

    /**
    *  根据主键id查询表sk_order信息
    *  @param id
    */
    @Override
    public Integer deleteSkOrderByid(@Param("id") Long id) { return skOrderMapper.deleteSkOrderByid(id);}

    /**
    *  根据主键id更新表sk_order信息
    *  @param skOrder
    */
    @Override
    public Integer updateSkOrderByid(SkOrder skOrder) { return skOrderMapper.updateSkOrderByid(skOrder);}

    /**
    *  新增表sk_order信息
    *  @param skOrder
    */
    @Override
    public Integer addSkOrder(SkOrder skOrder) { return skOrderMapper.addSkOrder(skOrder);}

}