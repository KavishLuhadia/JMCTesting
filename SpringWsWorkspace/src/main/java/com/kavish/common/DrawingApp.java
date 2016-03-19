package com.kavish.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
 public static void main(String args[]){
	 ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml"); 
	 System.out.println("Implementing spring core");
	 Shape shape = (Shape)context.getBean("circle");
	 shape.draw();
	//Properties of Application Context
	 context.getMessage("greeting", null, "Default Greeting", null);
 }
}
