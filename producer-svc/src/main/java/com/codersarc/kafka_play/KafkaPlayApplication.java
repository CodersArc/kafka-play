package com.codersarc.kafka_play;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
class MyRestController {

	private final static String TOPIC_1 = "my-topic-1";

	@Autowired
	private KafkaProducer messageProducer;

	@PostMapping("/send")
	public String sendMessage(@RequestParam("message") String message) {
		messageProducer.sendMessage(TOPIC_1, message);
		return "Message sent::" + message;
	}
}


@SpringBootApplication
public class KafkaPlayApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaPlayApplication.class, args);
	}
}