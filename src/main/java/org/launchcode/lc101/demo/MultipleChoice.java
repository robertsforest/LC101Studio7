package org.launchcode.lc101.demo;

public class MultipleChoice extends Question {

    @Override
    public boolean isResponseCorrect(String response) {
        if(response.equals(this.getCorrectAnswer())){
            return true;
        } else {
            return false;
        }
    }
}
