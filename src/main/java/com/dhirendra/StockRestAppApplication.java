package com.dhirendra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockRestAppApplication {
	private static final Logger logger = LoggerFactory.getLogger(StockRestAppApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(StockRestAppApplication.class, args);
		logger.debug("--Application Started--");
	}
}
