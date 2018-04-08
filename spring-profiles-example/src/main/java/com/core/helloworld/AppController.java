package com.core.helloworld;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
public class AppController {

	@Autowired
	AppService service;

	public AppService getService() {
		return service;
	}

	// @Required
	public void setService(AppService appService) {
		this.service = appService;
	}

}
