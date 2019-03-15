package com.itheima.b;

import javax.annotation.Resource;

@org.springframework.stereotype.Controller("controller")
public class Controller {
	@Resource(name="service")
	private Service service;
	public void add(){
		this.service.add();
	}
}
