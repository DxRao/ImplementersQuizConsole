package com.telusko.app;

import java.util.*;

public class QuizService
{

    int nums[] = new int[5]; // array of 5 integer
    Question questions[] = new Question[5]; // array of References

    public QuizService() {

        questions[0] = new Question(1, "What is the size of int?", "2", "6", "4", "8", "4");
        questions[1] = new Question(2, "What is the size of double?", "2", "6", "4", "8", "8");
        questions[2] = new Question(3, "What is the size of char?", "2", "6", "4", "8", "2");
        questions[3] = new Question(4, "What is the size of long?", "2", "6", "4", "8", "8");
        questions[4] = new Question(5, "What is the size of boolean?", "1", "2", "4", "8", "1");

    }

    public void playQuiz() {
    	
    	int score = 0;
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Welcome the Java student to Implementers Java Quiz." );
    	System.out.println("Please enter 1 to play the quiz or 2 to Quit the Quiz: "  );
    	int choice = scan.nextInt();
    	
    	if (choice == 1) {
    		
    		System.out.println("Welcome to the Java Mentor to Implementers Java Quiz." );
    		
    		for(Question q : questions)
    		{        	
    			System.out.println("Please read the following question to ask the student to enter the answer from following options: ");
    			System.out.println("Q:" + q.getQid() + " " + q.getTitle());
    			System.out.println("Options for Answer: " + q.getOption1() + "  " + q.getOption2() + "  " + q.getOption3() + "  " + q.getOption4() + " : ");
    			int ch = scan.nextInt();
            
    			if(Integer.parseInt(q.getAnswer()) == ch) {
    				score = score + 2;
    			}
    			else {
    				score = score - 1;
    			}
    		}//for
    		
    		System.out.println("Score of the student is: " + score + "." );
    		System.out.println("Thanks for playing the Implementors Quiz");
    		
    	}//Outer if
    	else{
    		
    		System.out.println("Thank you. Come later");    		
    	}    	    	
    }
}
