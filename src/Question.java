//This class represents a single question in the quiz.
//It contains the question text, a list of options, and the index of the correct option. It has two main methods:
//displayQuestion(): This method displays the question and its options.
//isCorrectAnswer(int answerIndex): This method takes an answer index, compares it with the correct answer index, and returns true if they match, false otherwise.

import java.util.List;

/**
 * This class represents a question in a quiz.
 */
public class Question {

    /**
     * The text of the question.
     */
    private String questionText;

    /**
     * The list of answer options for the question.
     */
    private List<String> options;

    /**
     * The index of the correct answer option in the options list.
     */
    private int correctOptionIndex;

    /**
     * Constructor to initialize the question data.
     *
     * @param questionText The text of the question
     * @param options The list of answer options
     * @param correctOptionIndex The index of the correct option
     */
    public Question(String questionText, List<String> options, int correctOptionIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctOptionIndex = correctOptionIndex;
    }

    // Getters and setters for the properties

    /**
     * Displays the question text and answer options.
     */
    public void displayQuestion() {
        System.out.println(this.questionText);
        for (String option : this.options) {
            System.out.println(option);
        }
    }

    /**
     * Checks if the given answer index matches the correct answer.
     *
     * @param answerIndex The given answer index
     * @return True if the answer is correct, false otherwise
     */
    public boolean isCorrectAnswer(int answerIndex) {
        return answerIndex == this.correctOptionIndex;
    }
}
