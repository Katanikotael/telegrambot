package com.github.katanikotael.jrtb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class TelegramBotApplication {

	public static void main(String[] args) {

//		System.getProperties().put("proxySet", "true");
//		System.getProperties().put("socksProxyHost", "127.0.0.1");
//		System.getProperties().put("socksProxyPort", "9150");

		SpringApplication.run(TelegramBotApplication.class, args);
	}
}
