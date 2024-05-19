package com.example.quiz.QuizManagement.service;

import java.util.Scanner;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.example.quiz.QuizManagement.model.Question;


@Component
public class QuestionService {
	
	Question[] questions = new Question[5];
	String selection[] = new String[5];
	Scanner scan = new Scanner(System.in);

	public QuestionService() {
		this.questions[0]  = new Question(1,"Size of int", "2", "4", "6", "8", "4" );
		this.questions[1]  = new Question(2,"Size of long", "2", "4", "6", "8", "8" );
		this.questions[2]  = new Question(3,"Size of char", "2", "4", "6", "8", "2" );
		this.questions[3]  = new Question(4,"Size of boolean", "1", "4", "6", "8", "1" );
		this.questions[4]  = new Question(5,"Size of double", "2", "4", "6", "8", "8" );
	}

	
	public void playQuiz() 
	{
		int i=0;
		
		for(Question q : questions) 
		{
			System.out.println("Question No. "+ q.getId() +". " + q.getQuestion());
			System.out.println("(a) "+ q.getOpt1());
			System.out.println("(b) "+ q.getOpt2());
			System.out.println("(c) "+ q.getOpt3());
			System.out.println("(d) "+ q.getOpt4());
			System.out.println("Type your answer here: ");
			selection[i] = scan.nextLine();
			i++;
		}
		
		System.out.println("Answers choosen: ");
		
		for(String s : selection) {
			System.out.println(s);
		}
	}


	public void printScore() 
	{
		int score = 0;
		
		for(int i=0;i<questions.length;i++) 
		{
			String actualAnswer = questions[i].getAnswer();
			String userAnswer = selection[i];
			
			if(actualAnswer.equals(userAnswer)) 
			{
				score++;
			}
		}
		System.out.println("Your score is : " + score);
	}
	
}
