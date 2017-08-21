package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		System.out.println("passwordEncoder() in WebMvcConfig is: "+bCryptPasswordEncoder);
		System.out.println("passwordEncoder() in WebMvcConfig to string is: "+bCryptPasswordEncoder.toString());
		System.out.println("passwordEncoder() in WebMvcConfig encode Welcome1 is: "+bCryptPasswordEncoder.encode("Welcome1"));
		System.out.println("passwordEncoder() in WebMvcConfig encode Welcome1 is: "+bCryptPasswordEncoder.encode("Welcome1"));
		System.out.println("passwordEncoder() in WebMvcConfig encode Welcome1 is: "+bCryptPasswordEncoder.encode("Welcome1"));
		System.out.println("passwordEncoder() in WebMvcConfig encode Welcome1 is: "+bCryptPasswordEncoder.encode("Welcome1"));
		System.out.println("passwordEncoder() in WebMvcConfig encode Welcome1 is: "+bCryptPasswordEncoder.encode("Welcome1"));
		System.out.println("passwordEncoder() in WebMvcConfig encode Welcome1 is: "+bCryptPasswordEncoder.encode("Welcome1"));
		return bCryptPasswordEncoder;
	}

}