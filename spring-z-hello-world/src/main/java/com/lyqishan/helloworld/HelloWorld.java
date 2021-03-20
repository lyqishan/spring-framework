package com.lyqishan.helloworld;

import com.lyqishan.helloworld.entity.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {
	public static void main(String[] args) {
		BeanFactory beanFactory=new ClassPathXmlApplicationContext("bean.xml");

//		Person p=beanFactory.getBean("myPerson",Person.class);
		Person p= (Person) beanFactory.getBean("myPerson","小明","山东","20");
		System.out.println(p.toString());
	}
}
