package com.lyp.seckill.service;

import com.lyp.seckill.pojo.SkOrder;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISkOrderService{

    /**
    *  查询表sk_order所有信息
    */
    List<SkOrder> findAllSkOrder();

    /**
    *  根据主键id查询表sk_order信息
    *  @param id
    */
    SkOrder findSkOrderByid(@Param("id") Long id);

    /**
    *  根据条件查询表sk_order信息
    *  @param skOrder
    */
    List<SkOrder> findSkOrderByCondition(SkOrder skOrder);

    /**
    *  根据主键id查询表sk_order信息
    *  @param id
    */
    Integer deleteSkOrderByid(@Param("id") Long id);

    /**
    *  根据主键id更新表sk_order信息
    *  @param skOrder
    */
    Integer updateSkOrderByid(SkOrder skOrder);

    /**
    *  新增表sk_order信息
    *  @param skOrder
    */
    Integer addSkOrder(SkOrder skOrder);
}