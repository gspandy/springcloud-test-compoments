package com.kite.test.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 类HelloController.java的实现描述：暴露对外服务
 * @author pengliang 2016年8月8日 下午4:23:14
 */
@RestController
public class HelloController {
	
	/**
	 * rest 服务用来测试 
	 * --@requestParam url?xxx=name 
	 * --requestBody 认定为json传输解析  url?{xxx=name}
	 * @param name
	 * @return
	 */
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(String name) {
		return "{hello: '" + name + "'}";
	}
	
}