package com.company;

public abstract class Question {
    String questionText;
    Answer answer;

    public Question(String questionText, Answer answer) {
        this.questionText = questionText;
        this.answer = answer;
    }

//    method to check if the user answer given is the answer that is correct
//    method to check if the user selects an answer
//        while loop --> once completed then submits
//    getters for the fields
//    setters for fields -- does this mean that someone could change the question or answer in the quiz?
//    method toString ????
//    if user answer matches correct answer, where does the increment go -- in quiz or question?
//        maybe use createID or getID method as a way to increment up??



    @Override
    public String toString() {
        return this.questionText;
    }
}

