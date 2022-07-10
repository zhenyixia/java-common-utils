package com.lyp.seckill.service;

import com.lyp.seckill.pojo.SkOrderInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISkOrderInfoService{

    /**
    *  查询表sk_order_info所有信息
    */
    List<SkOrderInfo> findAllSkOrderInfo();

    /**
    *  根据主键id查询表sk_order_info信息
    *  @param id
    */
    SkOrderInfo findSkOrderInfoByid(@Param("id") Long id);

    /**
    *  根据条件查询表sk_order_info信息
    *  @param skOrderInfo
    */
    List<SkOrderInfo> findSkOrderInfoByCondition(SkOrderInfo skOrderInfo);

    /**
    *  根据主键id查询表sk_order_info信息
    *  @param id
    */
    Integer deleteSkOrderInfoByid(@Param("id") Long id);

    /**
    *  根据主键id更新表sk_order_info信息
    *  @param skOrderInfo
    */
    Integer updateSkOrderInfoByid(SkOrderInfo skOrderInfo);

    /**
    *  新增表sk_order_info信息
    *  @param skOrderInfo
    */
    Integer addSkOrderInfo(SkOrderInfo skOrderInfo);
}