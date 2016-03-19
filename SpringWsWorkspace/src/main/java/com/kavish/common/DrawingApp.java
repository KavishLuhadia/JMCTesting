package com.kavish.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
 public static void main(String args[]){
	 ApplicationContext context = new ClassPathXmlApplicationContext(
				"Spring-Module.xml"); 
	 System.out.println("Implementing spring core");



	 System.out.println("In new branch lets c");

	 System.out.println("Making changes in branch2");

	 System.out.println("In new branch lets c");
	 System.out.println("Again making changes");



System.out.println("FETCH 123456");

System.out.println("PUSHED TO MASTER 1 SUCCESS AGAIN");

	 System.out.println("Making changes in branch2");


	 Shape shape = (Shape)context.getBean("circle");
	 System.out.println("changes in new bracnh2 for checking rebase");
	 System.out.println("This time check rebase");
	 System.out.println("rEBASE2");
	 System.out.println("REAL REBASE");
	 shape.draw();
	//Properties of Application Context
	 context.getMessage("greeting", null, "Default Greeting", null);
 }
}

