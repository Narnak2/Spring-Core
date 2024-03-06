package com.SpringCore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringCoreApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student)context.getBean("student1");
		System.out.println(student);
		
//		Student student2=(Student)context.getBean("student12");
//		System.out.println(student2);
	}

}
