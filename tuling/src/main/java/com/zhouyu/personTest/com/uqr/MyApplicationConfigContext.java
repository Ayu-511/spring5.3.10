package com.zhouyu.personTest.com.uqr;

import com.zhouyu.personTest.com.uqr.annotation.ComponentScan;

import java.lang.annotation.Annotation;

public class MyApplicationConfigContext {

	private Class config;




	public MyApplicationConfigContext(Class clazz) {
		this.config = clazz;
		boolean annotationPresent = clazz.isAnnotationPresent(ComponentScan.class);
		if (annotationPresent) {
			ComponentScan annotation = (ComponentScan) clazz.getAnnotation(ComponentScan.class);
			String path = annotation.value();
		}
	}
}
