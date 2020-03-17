package org.launchcode.lc101.demo;

public class Question {
    private String questionStatement;
    private String correctAnswer;

    public Question(String questionStatement, String correctAnswer) {
        this.questionStatement = questionStatement;
        this.correctAnswer = correctAnswer;
    }

    public Question(){}

    public String getQuestionStatement() {
        return questionStatement;
    }

    public void setQuestionStatement(String questionStatement) {
        this.questionStatement = questionStatement;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public boolean isResponseCorrect(String response){
        if(response.equals(this.getCorrectAnswer())){
            return true;
        } else {
            return false;
        }
    }
}
