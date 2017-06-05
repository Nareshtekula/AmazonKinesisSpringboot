package com.amazon.kinesis.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.kinesis.service.AmazonKinesisSerive;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	AmazonKinesisSerive amazonKinesisSerive;

	@RequestMapping(method = RequestMethod.GET)
	public String createUser() {
		String userName = "Welcome World";
		return userName;
	}

	@RequestMapping(value = "/sendStream", method = RequestMethod.POST, consumes = "application/json")
	public String searchUser(@RequestBody String stream) {
		return "send";

	}
}