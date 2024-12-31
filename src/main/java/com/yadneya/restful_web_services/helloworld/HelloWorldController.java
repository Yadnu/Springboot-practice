package com.yadneya.restful_web_services.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/namaste-duniya")
	public String namasteDuniya() {
		return "Namaste Duniya";
	}
	@GetMapping(path = "helloworldbean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hellow World");
	}
	
	@GetMapping(path = "namastebean")
	public NamasteBean namasteBean() {
		return new NamasteBean("Namaste Duniya!");
	}
	// Path parameter
	@GetMapping(path = "/helloworld/{name}")
	public HelloWorldBean helloBeanVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

	
	
}
