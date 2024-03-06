package com.SpringCore.collections;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Testclass {
	public static void main(String args[])
	{
		
	  ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/collections/collectionconfig.xml");
	  Emp emp=(Emp)context.getBean("employe1");
	  System.out.println(emp);
	  
	 
		
		
	}

}
