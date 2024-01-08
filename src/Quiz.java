//This class represents a quiz. It contains a list of Question objects. It has two main methods:
//displayQuiz(): This method displays all the questions in the quiz.
//scoreQuiz(List<Integer> playerAnswers): This method takes a list of player's answers, compares them with the correct answers, and returns the score as a percentage.

import java.util.List;

/**
 * This class represents a quiz. It contains a list of Question objects.
 */
public class Quiz {

    /**
     * The list of Question objects in this quiz
     */
    public List<Question> questions;

    /**
     * Constructor to initialize the questions list
     *
     * @param questions The list of questions for this quiz
     */
    public Quiz(List<Question> questions) {
        this.questions = questions;
    }

    /**
     * Displays all the questions in the quiz
     */
    public void displayQuiz() {
        for (Question question : this.questions) {
            question.displayQuestion();
        }
    }


    /**
     * Scores the quiz by comparing player answers to correct answers
     *
     * @param playerAnswers The list of player answers
     * @return The score as a percentage
     */
    public double scoreQuiz(List<Integer> playerAnswers) {

        double score = 0;

        for (int i = 0; i < this.questions.size(); i++) {

            Question question = this.questions.get(i);

            int answer = playerAnswers.get(i);

            if (question.isCorrectAnswer(answer)) {
                score++;
            }
        }

        return score / this.questions.size() * 100;
    }

}
