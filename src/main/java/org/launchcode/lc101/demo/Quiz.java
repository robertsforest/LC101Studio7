package org.launchcode.lc101.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numCorrect;

    public void runQuiz(Scanner scnr){
        numCorrect = 0;
        for(Question question: questions){
            askQuestion(scnr,question);
        }
        System.out.println("The student got " + numCorrect + " questions right out of " + questions.size()+ ".");
    }

    public String collectResponse(Scanner scnr, Question question){
        System.out.println(question.getQuestionStatement());
        return scnr.nextLine();
    }

    public void askQuestion(Scanner scnr, Question question){
        if(question.isResponseCorrect(collectResponse(scnr,question))){
            numCorrect++;
        }
    }

    public void addQuestion(Scanner scnr){
        System.out.println("Please enter the question statement:");
        String description = scnr.nextLine();
        System.out.println("Please enter the correct answer. If there are multiple correct, separate with spaces:");
        String correctAnswer = scnr.nextLine();
        questions.add(new Question(description,correctAnswer));
    }
}
