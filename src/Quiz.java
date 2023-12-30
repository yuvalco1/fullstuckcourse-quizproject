import java.util.List;

public class Quiz {

    public List<Question> questions;

    public Quiz(List<Question> questions) {
        this.questions = questions;
    }

    public void displayQuiz(){
        for (Question question : this.questions) {
            question.displayQuestion();
        }
    }


    public double scoreQuiz(List<Integer> playerAnswers){
        double score = 0;
        for (int i = 0; i < this.questions.size(); i++) {
            Question question = this.questions.get(i);
            int answer = playerAnswers.get(i);
            if(question.isCorrectAnswer(answer)){
                score++;
            }
        }
        return score/this.questions.size() * 100;
    }


}
