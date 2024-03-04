package com.sb.sbtest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldcontroller {
    /** 使用value注解提取配置文件中的信息 **/
    @Value("${person.name2}")
    private String girlfriend;
    @Value("${city[0]}")
    private String liveplace;
    @Value("${zoo.zooname}")
    private String zooplace;

    /** 使用environment注解提取配置文件中的信息**/
    @Autowired
    Environment env;

    @RequestMapping ("/hello")
    public String hello() {

        String str = girlfriend + " " + liveplace + " " + zooplace;
        String str2 = env.getProperty("person.name1") + " " + env.getProperty("person.age1");
        return str2;
    }
}
