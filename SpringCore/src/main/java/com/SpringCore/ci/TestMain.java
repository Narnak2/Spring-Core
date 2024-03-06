/**
 * The TestMain class initializes an ApplicationContext using an XML configuration file, retrieves
 * beans of type Person and Adition, and performs a sum operation using the Adition bean.
 */

package com.SpringCore.ci;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/ci/ciconfig.xml");
		
      Person   p=(Person) context.getBean("person");
      System.out.println(p);
    Adition add= (Adition) context.getBean("add");
    add.doSum();
         
	}

}
