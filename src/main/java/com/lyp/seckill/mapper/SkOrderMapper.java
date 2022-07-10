package com.lyp.seckill.mapper;

import com.lyp.seckill.pojo.SkOrder;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderMapper{

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