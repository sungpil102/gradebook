package gradebook.model;

/**
 * Score contains receive, and total
 *
 * @author Seong Pil Yoo
 */
public class Score {
    private int receiveScore;
    private int totalScore;

    public Score(int receiveScore, int totalScore) {
        this.receiveScore = receiveScore;
        this.totalScore = totalScore;
    }

    public void setReceiveScore(int receiveScore) {
        this.receiveScore = receiveScore;
    }

    public int getReceiveScore() {
        return this.receiveScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getTotalScore() {
        return this.totalScore;
    }
}
