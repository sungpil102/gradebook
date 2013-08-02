package gradebook.model;

import java.util.ArrayList;

/**
 * Default Grading Scheme contains,
 * Actual method of calculte scores, letter grade
 *
 * @author Seong Pil Yoo
 */
 public class DefaultGradingScheme implements GradingScheme {
     public static final double A = 90.0;
     public static final double B = 80.0;
     public static final double C = 70.0;
     public static final double D = 60.0;
     public static final double T = 100.0;
    @Override
        public Score calculateScore(ArrayList<GradebookItem> grades) {
        int receiveScores = 0;
        int totalScores = 0;

        for (GradebookItem grade: grades) {
            receiveScores += grade.getScore().getReceiveScore();
            totalScores += grade.getScore().getTotalScore();
        }

        receiveScores /= grades.size();
        totalScores /= grades.size();

        return new Score(receiveScores, totalScores);
    }
    @Override
        public LetterGrade calculateLetterGrade(
        ArrayList<GradebookItem> grades) {
        double fraction = 0.0;

        fraction = (double) calculateScore(grades).getReceiveScore() * T
            / (double) calculateScore(grades).getTotalScore();

        if (fraction >= A) {
            return new LetterGrade("A");
        } else if (fraction >= B) {
            return new LetterGrade("B");
        } else if (fraction >= C) {
            return new LetterGrade("C");
        } else if (fraction >= D) {
            return new LetterGrade("D");
        } else {
            return new LetterGrade("F");
        }
    }
 }
