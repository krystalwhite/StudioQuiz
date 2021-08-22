package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MultipleChoice president = new MultipleChoice("Who is the current US president:  a) Joe Biden, b) Barack Obama, or c) Donald Trump? Enter the letter of your answer. ", "a");
        MultipleChoice parks = new MultipleChoice("Which national park is in Maine: a) Acadia, b) Big Bend, c) Carlsbad Caverns? Enter the letter of your answer. ", "a");
        TrueFalse teacher = new TrueFalse("True or False: The Java instructor for CoderGirl is Mike Tully. ", "true");
        TrueFalse tree = new TrueFalse("True or False: The Missouri state tree is the American Sycamore. ", "false");
        CheckBox senators = new CheckBox("Select all the Senators from Missouri: a) Roy Blunt, b) Claire McCaskill, c) Josh Hawley, d) Ann Wagner.", "a, c");
        CheckBox kids = new CheckBox("Which are Krystal's kids?  a) Revathi, b) Atticus, c) Raina, d) Lola", "c, d");

        ArrayList<Question> initialQuizQuestions = new ArrayList<>();
        initialQuizQuestions.add(parks);
        initialQuizQuestions.add(teacher);
        initialQuizQuestions.add(president);

        Quiz practiceTest = new Quiz(initialQuizQuestions, new ArrayList<>());
        practiceTest.addQuestionToQuiz(tree);
        practiceTest.addQuestionToQuiz(senators);
        practiceTest.addQuestionToQuiz(kids);


        practiceTest.printAndTakeQuiz();
        practiceTest.checkUserResponsesAgainstAnswerKeyAndReturnGrade();

    }
}
