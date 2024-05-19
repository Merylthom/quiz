/**
 * 
 */
package com.example.quiz.QuizManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz.QuizManagement.service.QuestionService;

@RestController
@RequestMapping("/questions")
/**
 * 
 */
 public class QuizController {

	//private QuestionService questionService;
	/**
	 * 
	 */
	public QuizController(QuestionService questionService) {
		// TODO Auto-generated constructor stub
		questionService.playQuiz();
		questionService.printScore();
	}

	
}
