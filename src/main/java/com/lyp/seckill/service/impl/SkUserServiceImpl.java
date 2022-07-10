package com.lyp.seckill.service.impl;

import com.lyp.seckill.pojo.SkUser;
import com.lyp.seckill.mapper.SkUserMapper;
import com.lyp.seckill.service.ISkUserService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Service
public class SkUserServiceImpl implements ISkUserService {

    @Autowired
    private SkUserMapper skUserMapper;

    /**
    *  查询表sk_user所有信息
    */
    @Override
    public List<SkUser> findAllSkUser() { return skUserMapper.findAllSkUser();}

    /**
    *  根据主键id查询表sk_user信息
    *  @param id
    */
    @Override
    public SkUser findSkUserByid(@Param("id") Long id) { return skUserMapper.findSkUserByid(id);}

    /**
    *  根据条件查询表sk_user信息
    *  @param skUser
    */
    @Override
    public List<SkUser> findSkUserByCondition(SkUser skUser) { return skUserMapper.findSkUserByCondition(skUser);}

    /**
    *  根据主键id查询表sk_user信息
    *  @param id
    */
    @Override
    public Integer deleteSkUserByid(@Param("id") Long id) { return skUserMapper.deleteSkUserByid(id);}

    /**
    *  根据主键id更新表sk_user信息
    *  @param skUser
    */
    @Override
    public Integer updateSkUserByid(SkUser skUser) { return skUserMapper.updateSkUserByid(skUser);}

    /**
    *  新增表sk_user信息
    *  @param skUser
    */
    @Override
    public Integer addSkUser(SkUser skUser) { return skUserMapper.addSkUser(skUser);}

}