//This class represents a quiz taker.
//It contains the name of the quiz taker and has a method takeQuiz(Quiz quiz).
//This method takes a Quiz object, displays the quiz, collects the answers, calculates the score, and returns it.


import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class represents a quiz taker.
 */
public class QuizTaker {

    /**
     * The name of the quiz taker.
     */
    private final String name;

    /**
     * Constructor to initialize the quiz taker's name.
     *
     * @param name The name of the quiz taker
     */
    public QuizTaker(String name) {
        this.name = name;
    }

    // Getters and setters for the name property

    /**
     * Administers the given quiz to this quiz taker.
     * <p>
     * Displays welcome message, prompts for answers to each question,
     * scores the quiz based on the answers, and prints the final result.
     *
     * @return The score as a percentage
     */

    public String convertSecondsToTime(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secondes = seconds % 60;
        return String.format("%02d:%02d:%02d", hours, minutes, secondes);
    }


    public double takeQuiz(Quiz quiz) {

        // Print welcome message
        System.out.println("Hello " + this.name + ". Welcome to Yuval's Quiz !!!");
        System.out.println("You will be presented with 10 random questions, please answer each question with numbers only 1-4");
        System.out.println("Quiz Timer is starting now: "+convertSecondsToTime(0));
        // Start timer
        Instant start = Instant.now();
        long timeElapsed = 0;
        // Store quiz answers
        ArrayList<Integer> playerAnswers = new ArrayList<>();

        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Loop through questions
        for (Question question : quiz.questions) {

            // Display question
            question.displayQuestion();
            Instant finish = Instant.now();
            timeElapsed = (Duration.between(start, finish).toSeconds());

            System.out.println("Time taken so far: "+ convertSecondsToTime((int) timeElapsed));

            // Get answer input
            int answer = 0;
            while (answer < 1 || answer > 4) {
                System.out.println("Please enter a valid answer (1-4): ");
                answer = scanner.nextInt();
            }

            // Add answer to list
            playerAnswers.add(answer);
        }

        // Score quiz and print result
        System.out.println("Your score is: " + quiz.scoreQuiz(playerAnswers) + "%");
        Instant finish = Instant.now();
        timeElapsed = (Duration.between(start, finish).toSeconds());

        System.out.println("Total time to take the Quiz: "+ convertSecondsToTime((int) timeElapsed));
        return quiz.scoreQuiz(playerAnswers);

    }


}
