package com.example.Practice10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Practice10Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Practice10Application.class, args);

		Magican voldemort = context.getBean("voldemort", Magican.class);
		voldemort.doMagic();

		Magican ronWeesly = context.getBean("ronWeesly", Magican.class);
		ronWeesly.doMagic();

		Magican harryPoter = context.getBean("harryPotter", Magican.class);
		harryPoter.doMagic();
	}

}
