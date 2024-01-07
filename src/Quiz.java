//This class represents a quiz. It contains a list of Question objects. It has two main methods:
//displayQuiz(): This method displays all the questions in the quiz.
//scoreQuiz(List<Integer> playerAnswers): This method takes a list of player's answers, compares them with the correct answers, and returns the score as a percentage.

import java.util.List;

public class Quiz {

    public List<Question> questions;

    public Quiz(List<Question> questions) {
        this.questions = questions;
    }

    public void displayQuiz() {
        for (Question question : this.questions) {
            question.displayQuestion();
        }
    }


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
