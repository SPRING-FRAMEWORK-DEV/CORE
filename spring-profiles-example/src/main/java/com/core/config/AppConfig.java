package com.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

	@Profile("qa")
	@Bean
	public DataSource dataSourceQA() {
		return new DataSource();
	}

	@Profile("prod")
	@Bean
	public DataSource dataSourcePROD() {
		return new DataSource();
	}

	@Profile("test")
	@Bean
	public DataSource dataSourceTEST() {
		return new DataSource();
	}

}
