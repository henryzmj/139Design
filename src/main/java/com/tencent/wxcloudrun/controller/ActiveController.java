package com.tencent.wxcloudrun.controller;/**
 * @Description
 * @author:zhoumeijun@hylink.net.cn
 * @date 2022/10/31
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName
 * @Description
 * @Author
 * @Date 2022/10/31 15:09
 * @Version 1.0
 **/
@Slf4j
@RestController
@RequestMapping(value = "/hrbxhn")
public class ActiveController {

    @PostMapping("/active")
    public String active() {
        log.info("test successful");
        return "zmjtest";
    }
}
