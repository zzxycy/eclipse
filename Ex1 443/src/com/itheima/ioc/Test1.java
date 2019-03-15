package com.itheima.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		ConDisk conDisk=(ConDisk) applicationContext.getBean("con");
		UsbDisk usbDisk=(UsbDisk) applicationContext.getBean("usb");
		conDisk.read();
		conDisk.write();
		usbDisk.read();
		usbDisk.write();
	}

}
