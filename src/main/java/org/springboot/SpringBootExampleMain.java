package org.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootExampleMain {

	public static void main(String[] args) {
//		We now need to tell SpringBoot to start the application from the annotated main class,
//		   and host it in a servlet container. All this done in a single line below
		SpringApplication.run(SpringBootExampleMain.class,args);

	}

}
