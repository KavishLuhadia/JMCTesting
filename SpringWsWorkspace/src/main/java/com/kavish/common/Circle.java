package com.kavish.common;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape {
private Point center;
private MessageSource messageSource;



public MessageSource getMessageSource() {
	return messageSource;
}
@Autowired
public void setMessageSource(MessageSource messageSource) {
	this.messageSource = messageSource;
}

public Point getCenter() {
	return center;
}

/*@Autowired
 * @Qualifier("circleRelated")
public void setCenter(Point center) {
	this.center = center;
}*/

/*@Required
public void setCenter(Point center) {
	this.center = center;
}*/

//javax annotations
//Resource is byName
@Resource(name="zeroPoint")
public void setCenter(Point center) {
	this.center = center;
}
public void draw(){
	//System.out.println("Circle center point location "+ center.getX() +" "+ center.getY());
	System.out.println(this.messageSource.getMessage("circle.coordinates",new Object[]{center.getX() +","+ center.getY()} , "Default circle coordinates", Locale.US));
} 
/*@PostConstruct
public void myInit(){
	System.out.println("Initialization by Javax annotation");
}
@PreDestroy
public void myClean(){
	System.out.println("Destroy by Javax annotation");
}*/
}

