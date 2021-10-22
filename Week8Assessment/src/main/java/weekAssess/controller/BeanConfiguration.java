package weekAssess.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import weekAssess.beans.House;

/**
 * @author krebs jjkrebs1
 * CIS 175 - Fall 2021
 * Oct 21, 2021
 */

@Configuration
public class BeanConfiguration {
	@Bean
	public House house() {
		House bean = new House("324 East Drive", "Yellow", 123000);
		
		return bean;
	}
	

}
