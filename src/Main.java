//This is the main class of the application.
// It contains the main method which is the entry point of the application.
// It provides a menu to the user to start a quiz, display quiz results, or exit the system.
// It also contains two helper methods:
//populateQuestions(): This method creates a list of Question objects and returns it.
//generateRandomQuiz(List<Question> allquestions): This method takes a list of all questions, shuffles them, and returns a sublist of 10 questions.
//

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Double> quiztakerslist = new HashMap<>();

        int option = 0;
        while (option != 3) {
            System.out.println("Welcome to Yuval's Quiz, Please choose an option: ");
            System.out.println("1 - Start a quiz by entering their name. ; 2 - Display quiz results for all players. ; 3 - Exit the quiz system");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Please enter your name: ");
                    String name = scanner.next();
                    Quiz quiz = new Quiz(generateRandomQuiz(populateQuestions()));
                    QuizTaker quiztaker = new QuizTaker(name);
                    double score = Math.round(quiztaker.takeQuiz(quiz));
                    quiztakerslist.put(name, score);
                    break;
                case 2:
                    System.out.println("---------------------------------------------------------------------------------------------");
                    System.out.printf("%20s %10s", "QUIZ TAKER NAME", "SCORE");
                    System.out.println();
                    System.out.println("---------------------------------------------------------------------------------------------");
                    //iterates over the list
                    for (String i : quiztakerslist.keySet()) {
                        System.out.format("%20s %10s", i,quiztakerslist.get(i));
                        System.out.println();
                    }
                    System.out.println("----------------------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Exiting the quiz system");
                    scanner.close();
                    break;
                default:
                    System.out.println("Please choose a valid option");
                    break;
            }

        }


    }

    private static List<Question> populateQuestions() {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France?", Arrays.asList("1. Berlin ","2. Paris ","3. Madrid ","4. Rome "),2));
        questions.add(new Question("What is the smallest planet in our solar system?", Arrays.asList("1. Earth ","2. Mars ","3. Mercury ","4. Venus "),3));
        questions.add(new Question("Who was the first person to walk on the moon?", Arrays.asList("1. Buzz Aldrin ","2. Neil Armstrong ","3. Michael Collins ","4. Yuri Gagarin "),2));
        questions.add(new Question("What is the largest mammal in the world?", Arrays.asList("1. Elephant ","2. Blue Whale ","3. Giraffe ","4. Hippopotamus "),2));
        questions.add(new Question("What is the capital of Australia?", Arrays.asList("1. Sydney ","2. Melbourne ","3. Canberra ","4. Perth "),3));
        questions.add(new Question("Who painted the Mona Lisa?", Arrays.asList("1. Vincent van Gogh ","2. Leonardo da Vinci ","3. Pablo Picasso ","4. Michelangelo "),2));
        questions.add(new Question("What is the largest country in the world by land area?", Arrays.asList("1. Russia ","2. China ","3. United States ","4. Canada "),1));
        questions.add(new Question("What is the capital of Japan?", Arrays.asList("1. Tokyo ","2. Kyoto ","3. Osaka ","4. Hiroshima "),1));
        questions.add(new Question("Who wrote the novel To Kill a Mockingbird?", Arrays.asList("1. Harper Lee ","2. J.Salinger ","3. Ernest Hemingway ","4. F.Scott Fitzgerald "),1));
        questions.add(new Question("What is the capital of Brazil?", Arrays.asList("1. Rio de Janeiro ","2. Brasília ","3. São Paulo ","4. Salvador "),2));
        questions.add(new Question("Who is the current Prime Minister of the United Kingdom?", Arrays.asList("1. Boris Johnson ","2. Theresa May ","3. David Cameron ","4. Tony Blair "),1));
        questions.add(new Question("What is the capital of South Africa?", Arrays.asList("1. Johannesburg ","2. Cape Town ","3. Pretoria ","4. Durban "),3));
        questions.add(new Question("Who directed the movie Jaws?", Arrays.asList("1. Steven Spielberg ","2. George Lucas ","3. Martin Scorsese ","4. Francis Ford Coppola "),1));
        questions.add(new Question("What is the capital of Canada?", Arrays.asList("1. Toronto ","2. Vancouver ","3. Ottawa ","4. Montreal "),3));
        questions.add(new Question("Who was the first female Prime Minister of the United Kingdom?", Arrays.asList("1. Theresa May ","2. Margaret Thatcher ","3. Angela Merkel ","4. Indira Gandhi "),2));
        questions.add(new Question("What is the capital of Italy?", Arrays.asList("1. Rome ","2. Milan ","3. Naples ","4. Florence "),1));
        questions.add(new Question("Who wrote the novel 1984?", Arrays.asList("1. George Orwell ","2. Aldous Huxley", "3. Ray Bradbury ","4. J.Salinger "),1));
        questions.add(new Question("What is the capital of Spain?", Arrays.asList("1. Madrid ","2. Barcelona ","3. Valencia ","4. Seville "),1));
        questions.add(new Question("Who painted the ceiling of the Sistine Chapel?", Arrays.asList("1. Leonardo da Vinci ","2. Michelangelo ","3. Raphael ","4. Donatello "),2));
        questions.add(new Question("What is the capital of Egypt?", Arrays.asList("1. Cairo ","2. Alexandria ","3. Luxor ","4. Giza "),1));




        return questions;
    }

    private static List<Question> generateRandomQuiz(List<Question> allquestions) {

        Collections.shuffle(allquestions);
        return allquestions.subList(1, 10);
    }
}