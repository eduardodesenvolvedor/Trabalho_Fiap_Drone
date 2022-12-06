package br.com.fiap.scjr.drone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DroneFiap {

	public static void main(String[] args) {
		SpringApplication.run(DroneFiap.class, args);
	}

}