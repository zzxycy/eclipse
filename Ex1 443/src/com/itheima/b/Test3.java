package com.itheima.b;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlPath="com/itheima/b/bean2.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		Controller controller=(Controller) applicationContext.getBean("controller");
		controller.add();
	}

}
