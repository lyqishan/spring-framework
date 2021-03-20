package com.lyqishan.helloworld;

import com.lyqishan.helloworld.entity.Person;
import com.lyqishan.helloworld.service.PersonService;
import com.lyqishan.helloworld.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Constructor;

/**
 * 需要导入spring 基本包，beans,core,context,expression
 */
public class HelloWorld {
	public static void main(String[] args) throws Exception {
		ApplicationContext bean=new ClassPathXmlApplicationContext("bean.xml");

		PersonService personService=bean.getBean("personService", PersonServiceImpl.class);
		personService.sayHello(null);
	}
}
