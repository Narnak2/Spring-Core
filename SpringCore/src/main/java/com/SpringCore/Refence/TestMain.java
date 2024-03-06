package com.SpringCore.Refence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ApplicationContext	context=	new ClassPathXmlApplicationContext("com/SpringCore/Refence/refconfig.xml");

		 A temp=(A)context.getBean("aref");
		 System.out.println(temp.getId());
		 System.out.println(temp.getObjectOfB().getY());
		 System.out.println(temp);
				 
	}

}
