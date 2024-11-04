package vn.ute;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import vn.ute.configs.MySiteMeshFilter;

@SpringBootApplication
public class Demo1Springboot3Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Demo1Springboot3Application.class, args);
		
	}

	@Bean
	 public FilterRegistrationBean<MySiteMeshFilter> siteMeshFilter() {
		
	   FilterRegistrationBean<MySiteMeshFilter> filterRegistrationBean 
	         = new FilterRegistrationBean<MySiteMeshFilter>();
	   filterRegistrationBean.setFilter(new MySiteMeshFilter()); // adding sitemesh filter ??
       filterRegistrationBean.addUrlPatterns("/*");
	   return filterRegistrationBean;

	 }
	
}
