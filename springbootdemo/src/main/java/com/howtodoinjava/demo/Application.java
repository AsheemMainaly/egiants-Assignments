package com.howtodoinjava.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
		
		@Bean
		public RestTemplate restTemplate(RestTemplateBuilder builder) {
			return builder.build();
		}

		@Bean
		public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
			return args -> {
				Quote quote = restTemplate.getForObject(
						"https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
				log.info(quote.toString());
			};
		}
	}
}
