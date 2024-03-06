package com.SpringCore.lifeCycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The Test class in Java initializes a Spring application context, retrieves a bean named "s1" of type
 * Samosa, and prints its information.
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/lifeCycle/config.xml");

		Samosa s1 = (Samosa) context.getBean("s1");
		System.out.println(s1);
		context.registerShutdownHook(); 

		System.out.println("+++++++++++++++++++++++++");
		Pepsi p1=(Pepsi)context.getBean("p1");
		System.out.println(p1);

	}

}
