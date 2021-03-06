package com.kite.test.springcloud.client.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kite.test.springcloud.feginclient.HelloFeginClient;

/**
 * 调用测试
 * 类CallHelloController.java的实现描述：调用feginClient测试
 * @author pengliang 2016年8月8日 下午4:42:14
 */
@RestController
public class CallHelloController {
	
	private Logger log = LoggerFactory.getLogger(CallHelloController.class);
	@Autowired
	private HelloFeginClient helloFeginClient;
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String hello(String name) {
		log.info("call hello parameter:{}", name);
		return helloFeginClient.hello(name);  
	}
}