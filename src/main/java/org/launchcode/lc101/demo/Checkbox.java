package org.launchcode.lc101.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class Checkbox extends Question {
    @Override
    public boolean isResponseCorrect(String response) {
        String[] selections = response.split(" ");
        String[] answers = this.getCorrectAnswer().split(" ");
        ArrayList<String> selectionList = new ArrayList<String>(Arrays.asList(selections));
        ArrayList<String> answerList = new ArrayList<String>(Arrays.asList(answers));
        int selectionLength = selectionList.size();
        int answerLength = answerList.size();
        if(answerLength != selectionLength){
            return false;
        }

        while(selectionLength > 0){
            if(answerList.contains(selectionList.get(selectionLength))){
                selectionLength--;
            } else {
                return false;
            }
        }

        return true;

    }
}
