package com.kite.test.springcloud.feginclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * feginClient接口
 * 类HelloFeginClient.java的实现描述：通过feginClient自动调用
 * @author pengliang 2016年8月8日 下午4:25:36
 */
@FeignClient(value="HelloServer") //对应到的server端的spring.application.name
public interface HelloFeginClient {
	
@RequestMapping(value = "/hello", method=RequestMethod.POST)
	public String hello(@RequestParam(name="name") String name);

}