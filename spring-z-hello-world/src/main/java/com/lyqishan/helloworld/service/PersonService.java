package com.lyqishan.helloworld.service;

import org.springframework.lang.NonNull;

public interface PersonService {
	void sayHello(@NonNull String message);
}
