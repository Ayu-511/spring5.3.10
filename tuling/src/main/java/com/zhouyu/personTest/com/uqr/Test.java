package com.zhouyu.personTest.com.uqr;

import com.zhouyu.service.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test {

	private final String str = "123";
	public static void main(String[] args) {
//		MyApplicationConfigContext configContext = new MyApplicationConfigContext(AppConfig.class);


		new AnnotationConfigApplicationContext(AppConfig.class);
//		new ClassPathXmlApplicationContext("applicationContext.xml");
//
//
//		List<String> words = Arrays.asList("Java", "Stream", "API", "example");
//		boolean allMatch = words.stream().anyMatch(s -> s.equals("API"));
//		System.out.println(allMatch); // true



	}
}
