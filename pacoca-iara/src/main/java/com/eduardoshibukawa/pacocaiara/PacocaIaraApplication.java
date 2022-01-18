package com.eduardoshibukawa.pacocaiara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableConfigurationProperties
@RefreshScope
@SpringBootApplication
public class PacocaIaraApplication {

	public static void main(String[] args) {
		SpringApplication.run(PacocaIaraApplication.class, args);
	}

}
