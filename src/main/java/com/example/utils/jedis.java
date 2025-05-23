package com.example.utils;

import redis.clients.jedis.Jedis;

public class jedis {

    public static void main(String[] args) {
// 创建 Jedis 对象,连接到本地 Redis 服务器
        Jedis jedis = new Jedis("localhost", 6379);

// 设置键值对
        jedis.set("key", "Hello, Redis!");

// 获取并打印值
        String value = jedis.get("key");
        System.out.println("Stored value in Redis: " + value);

// 关闭连接
        jedis.close();
    }

}
