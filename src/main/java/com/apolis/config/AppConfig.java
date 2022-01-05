package com.apolis.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.apolis.*"})
public class AppConfig
{
	@Bean
	public InternalResourceViewResolver resolver()
	{
		InternalResourceViewResolver r = new InternalResourceViewResolver();
		r.setViewClass(JstlView.class);
		r.setPrefix("/WEB-INF/views/");
		r.setSuffix(".Jsp");
		return r;
	}
}
