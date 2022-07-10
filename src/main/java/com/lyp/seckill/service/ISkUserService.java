package com.lyp.seckill.service;

import com.lyp.seckill.pojo.SkUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ISkUserService{

    /**
    *  查询表sk_user所有信息
    */
    List<SkUser> findAllSkUser();

    /**
    *  根据主键id查询表sk_user信息
    *  @param id
    */
    SkUser findSkUserByid(@Param("id") Long id);

    /**
    *  根据条件查询表sk_user信息
    *  @param skUser
    */
    List<SkUser> findSkUserByCondition(SkUser skUser);

    /**
    *  根据主键id查询表sk_user信息
    *  @param id
    */
    Integer deleteSkUserByid(@Param("id") Long id);

    /**
    *  根据主键id更新表sk_user信息
    *  @param skUser
    */
    Integer updateSkUserByid(SkUser skUser);

    /**
    *  新增表sk_user信息
    *  @param skUser
    */
    Integer addSkUser(SkUser skUser);
}