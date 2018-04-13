package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("hello.do")
	public String hello() {
		System.out.println("hello()");
		return "hello";
	}
	
	
	/*
	 * 如果配置拦截器时使用/*，则不会拦截该地址的请求方法
	 * 如果配置拦截器时使用/**,则会拦截所有地址请求的方法。
	 */
	@RequestMapping("demo/hello.do")
	public String hello2() {
		System.out.println("hello2()");
		return "hello";
	}
	
}
