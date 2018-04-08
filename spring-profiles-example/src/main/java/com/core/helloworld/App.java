package com.core.helloworld;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.core.config.AppConfig;

/**
 * Hello world!
 *
 */
@Import(AppConfig.class)
public class App {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com");
		context = new ClassPathXmlApplicationContext("beans.xml");
		Arrays.stream(context.getBeanDefinitionNames()).forEach(e -> {
			System.out.println(e);
		});

	}

}
