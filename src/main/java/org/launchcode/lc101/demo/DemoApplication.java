package org.launchcode.lc101.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

public class DemoApplication {

    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();
        Scanner scnr = new Scanner(System.in);
        String input = "a";

        while(input.charAt(0) != 'n'){
            myQuiz.addQuestion(scnr);
            System.out.println("Add another question? (y/n)");
            input = scnr.nextLine();
        }
        myQuiz.runQuiz(scnr);

    }

}
