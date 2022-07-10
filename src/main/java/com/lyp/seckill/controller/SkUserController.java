package com.lyp.seckill.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.lyp.seckill.service.ISkUserService;

@RestController
@RequestMapping("/skUser")
public class SkUserController {

    @Autowired
    private ISkUserService skUserService;



}