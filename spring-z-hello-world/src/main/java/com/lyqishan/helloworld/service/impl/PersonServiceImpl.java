package com.lyqishan.helloworld.service.impl;

import com.lyqishan.helloworld.service.PersonService;

public class PersonServiceImpl implements PersonService {
	@Override
	public void sayHello(String message) {
		System.out.println("Hello World !");
	}
}
