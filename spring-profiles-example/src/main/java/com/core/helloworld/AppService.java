package com.core.helloworld;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AppService {

	public AppService() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("----------------");
	}

}
