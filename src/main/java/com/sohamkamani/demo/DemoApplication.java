package com.sohamkamani.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// This annotation instructs Spring to initialize its configuration - which is needed to start a
// new application
@SpringBootApplication
// Indicates that this class contains RESTful methods to handle incoming HTTP requests
@RestController
public class DemoApplication {

	// We can start our application by calling the run method with the primary class
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	// The `GetMapping` annotation indicates that this method should be called
	// when handling GET requests to the "/simple-request" endpoint
	@GetMapping("/simple-request")
	public String simpleRequest() {
		// In this case, we return the plain text response "ok"
		return "ok";
	}

	@GetMapping("/echo")
	// We can pass the name of the url param we want as an argument to the RequestParam annotation.
	// The value will be stored in the annotated variable
	public String echo(@RequestParam(name = "text") String echoText) {
		// The response will be "Echo: " followed by the param that was passed in
		return "Echo: " + echoText;
	}

}
