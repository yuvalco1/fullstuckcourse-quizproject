
public class Score {


    private String name;

    private double score;

    public Score(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [ name: "+name+", score: "+ score+ " ]";
    }


    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

}
