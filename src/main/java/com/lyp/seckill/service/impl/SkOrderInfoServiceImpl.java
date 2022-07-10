package com.lyp.seckill.service.impl;

import com.lyp.seckill.pojo.SkOrderInfo;
import com.lyp.seckill.mapper.SkOrderInfoMapper;
import com.lyp.seckill.service.ISkOrderInfoService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Service
public class SkOrderInfoServiceImpl implements ISkOrderInfoService {

    @Autowired
    private SkOrderInfoMapper skOrderInfoMapper;

    /**
    *  查询表sk_order_info所有信息
    */
    @Override
    public List<SkOrderInfo> findAllSkOrderInfo() { return skOrderInfoMapper.findAllSkOrderInfo();}

    /**
    *  根据主键id查询表sk_order_info信息
    *  @param id
    */
    @Override
    public SkOrderInfo findSkOrderInfoByid(@Param("id") Long id) { return skOrderInfoMapper.findSkOrderInfoByid(id);}

    /**
    *  根据条件查询表sk_order_info信息
    *  @param skOrderInfo
    */
    @Override
    public List<SkOrderInfo> findSkOrderInfoByCondition(SkOrderInfo skOrderInfo) { return skOrderInfoMapper.findSkOrderInfoByCondition(skOrderInfo);}

    /**
    *  根据主键id查询表sk_order_info信息
    *  @param id
    */
    @Override
    public Integer deleteSkOrderInfoByid(@Param("id") Long id) { return skOrderInfoMapper.deleteSkOrderInfoByid(id);}

    /**
    *  根据主键id更新表sk_order_info信息
    *  @param skOrderInfo
    */
    @Override
    public Integer updateSkOrderInfoByid(SkOrderInfo skOrderInfo) { return skOrderInfoMapper.updateSkOrderInfoByid(skOrderInfo);}

    /**
    *  新增表sk_order_info信息
    *  @param skOrderInfo
    */
    @Override
    public Integer addSkOrderInfo(SkOrderInfo skOrderInfo) { return skOrderInfoMapper.addSkOrderInfo(skOrderInfo);}

}