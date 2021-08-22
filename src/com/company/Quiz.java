package com.company;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions;
    private ArrayList<String> userResponses;
    private int totalCorrect = 0;
    private int totalPossible = 0;

    public Quiz(ArrayList<Question> questions, ArrayList<String> userResponses) {
        this.questions = questions;
        this.userResponses = userResponses;
    }

    public void addQuestionToQuiz(Question newQuestion) {
        questions.add(newQuestion);
    }

    public void printAndTakeQuiz() {
        Scanner input = new Scanner(System.in);
        for (Question item : questions) {
            System.out.println(item.getQuestionText());;
            String userResponse = input.nextLine();
            this.userResponses.add(userResponse);
        }
    }

    public void checkUserResponsesAgainstAnswerKeyAndReturnGrade(){
        for (int i = 0; i < this.questions.size(); i++) {
            this.totalPossible++;
            if (questions.get(i).getAnswer().equals(userResponses.get(i))) {
                this.totalCorrect++;
            }
            System.out.println("The correct answer is " + questions.get(i).getAnswer() + " and you answered " + userResponses.get(i) + ".");
//            System.out.println("Your total correct is " + totalCorrect + " out of " + totalPossible + " points.");
        }

        double percent = this.totalCorrect * 100 / this.totalPossible;
        System.out.println("You earned " + percent + "% on this quiz.");
    }

    public void scoreUserQuizAsPercentage() {
        double decimal = this.totalCorrect / this.totalPossible;
        double percent = decimal * 100;
        String output = "You earned " + percent + "% on this quiz.";
        System.out.println(output);
    }


//    method to check if the user selects an answer
//        while loop --> once completed then submits


}
