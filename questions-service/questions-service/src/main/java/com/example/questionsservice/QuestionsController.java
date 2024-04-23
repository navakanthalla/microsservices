package com.example.questionsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/questions")
public class QuestionsController {

	@GetMapping("/getMessage")
	public String sendMessage()
	{
		return "questions success";
	}
}
