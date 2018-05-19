package com.gomezrondon.kafka.testkafkaproduccer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class TestKafkaProduccerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestKafkaProduccerApplication.class, args);
	}
}
