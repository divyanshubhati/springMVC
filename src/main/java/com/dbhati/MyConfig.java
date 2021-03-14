package com.dbhati;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.dbhati"})
public class MyConfig {
// 1. Placed the display.jas under WEB-INF , to make it private
// 2. Removed the .jsp extension from ctrl class
	@Bean
	public InternalResourceViewResolver viewResolver() {
		// can be any method name
		// return type matters
		// this internal view resolver is responsible for resolving view name
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		return vr;
	}
	
}
