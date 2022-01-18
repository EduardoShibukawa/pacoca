package com.eduardoshibukawa.pacocaconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PacocaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacocaConfigServerApplication.class, args);
	}

}
