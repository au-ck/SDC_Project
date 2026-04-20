package com.klef.fsd.sdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//component scan is used for entering the packeges manually (if there is multiple then use comma)
@SpringBootApplication
public class SpringBootSdpProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSdpProjectApplication.class, args);
		System.out.println("project running");
	}

}
