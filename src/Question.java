//This class represents a single question in the quiz.
//It contains the question text, a list of options, and the index of the correct option. It has two main methods:
//displayQuestion(): This method displays the question and its options.
//isCorrectAnswer(int answerIndex): This method takes an answer index, compares it with the correct answer index, and returns true if they match, false otherwise.

import java.util.List;

public class Question {

    private String questionText;

    private List<String> options;

    private int correctOptionIndex;


    public Question(String questionText, List<String> options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }


    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public int getCorrectOptionIndex() {
        return correctOptionIndex;
    }

    public void setCorrectOptionIndex(int correctOptionIndex) {
        this.correctOptionIndex = correctOptionIndex;
    }

    public void displayQuestion() {
        System.out.println(this.questionText);
        for (String option : this.options) {
            System.out.println(option);
        }
    }

    public boolean isCorrectAnswer(int answerIndex) {
        return answerIndex == this.correctOptionIndex;
    }

}
