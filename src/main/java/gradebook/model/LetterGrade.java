package gradebook.model;

import java.util.ArrayList;

/**
 * Letter Grade contain A, B, C, D, E, F
 *
 * @author Seong Pil Yoo
 */
public class LetterGrade {
    private String letterGrade;
    private ArrayList<String> letterGrades = new ArrayList<String>();

    public LetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
        this.letterGrades.add("A");
        this.letterGrades.add("B");
        this.letterGrades.add("C");
        this.letterGrades.add("D");
        this.letterGrades.add("F");
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public String getLetterGrade() {
        return this.letterGrade;
    }

    public int getIndexOfLetterGrade() {
        return letterGrades.indexOf(this.letterGrade);
    }

    public LetterGrade getLetterGradeOfIndex(int index) {
        return new LetterGrade(letterGrades.get(index));
    }
}
