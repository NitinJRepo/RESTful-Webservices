package com.nitin.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
	
	//We need three things:
	//1. what type of request method we want to use Ex: GET,POST
	//2. Which URI we want to use to locate the resource Ex: /hello-world
	//3. To which method we want to map the URI- Ex: helloWorld()
	
	@RequestMapping(method = RequestMethod.GET, path = "hello-world")
	public String helloWorld() {
		return "Hello World";	
	}
	
	@GetMapping(path = "/hello-world-2")
	public String helloWorld2() {
		return "Hello World-2";	
	}
	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello-world");	
	}
	
	//Path variable
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello-world %s", name));	
	}
}
