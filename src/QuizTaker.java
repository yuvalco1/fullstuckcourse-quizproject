//This class represents a quiz taker.
//It contains the name of the quiz taker and has a method takeQuiz(Quiz quiz).
//This method takes a Quiz object, displays the quiz, collects the answers, calculates the score, and returns it.


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuizTaker {

    private String name;

    public QuizTaker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double takeQuiz(Quiz quiz) {

        System.out.println("Hello " + this.name + ". Welcome to Yuval's Quiz !!!");
        System.out.println("You will be presented with 10 random question, please answer each question with numbers only 1-4");

        ArrayList<Integer> playerAnswers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (Question question : quiz.questions) {
            question.displayQuestion();
            int answer = 0;
            while (answer < 1 || answer > 4) {
                System.out.println("Please enter a valid answer (1-4): ");
                answer = scanner.nextInt();
            }
            playerAnswers.add(answer);
        }
        //scanner.close();
        System.out.println("Your score is: " + quiz.scoreQuiz(playerAnswers) + "%");
        return quiz.scoreQuiz(playerAnswers);
    }


}
