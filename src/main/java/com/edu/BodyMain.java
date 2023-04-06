package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BodyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
           HumanBody humanbody =(HumanBody) ctx.getBean("humanBody");  
           humanbody.bodyMethod();
           
	}

}
