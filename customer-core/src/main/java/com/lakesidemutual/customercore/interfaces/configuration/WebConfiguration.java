package com.lakesidemutual.customercore.interfaces.configuration;

import javax.servlet.Filter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.ShallowEtagHeaderFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * The WebConfiguration class is used to customize the default Spring MVC configuration.
 * */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

	/**
	 * This is a filter that generates an ETag value based on the content of the response. This ETag is compared to the If-None-Match header
	 * of the request. If these headers are equal, the response content is not sent, but rather a 304 "Not Modified" status instead.
	 * */
	@Bean
	public Filter shallowETagHeaderFilter() {
		return new ShallowEtagHeaderFilter();
	}
}