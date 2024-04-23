package com.example.gatewayservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway")
public class GatewayController {
	
	@GetMapping("/message")
	public String getMessage()
	{
		return "gateway message";
	}

}
