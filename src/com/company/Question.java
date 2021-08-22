package com.company;

import java.util.Scanner;

public abstract class Question {
    private String questionText;
    private String answer;

    public Question(String questionText, String answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

    @Override
    public String toString() {
        return this.questionText;
    }



    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean checkAnswer(Scanner response) {
        if (response.nextLine() == this.getAnswer()) {
            return true;
        } else {
            return false;
        }
    }

}