package com.liuchuanhung.springboot.data.redis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping
    public void setValueToRedisCache() {
        redisTemplate.opsForValue().set("hello", "world");
    }
}