package gradebook.model;

import java.util.ArrayList;

/**
 * Grading Scheme Interface contains,
 * method of calculte scores, letter grade
 *
 * @author Seong Pil Yoo
 */
 public interface GradingScheme {
    Score calculateScore(ArrayList<GradebookItem> grades);
    LetterGrade calculateLetterGrade(ArrayList<GradebookItem> grades);
 }
