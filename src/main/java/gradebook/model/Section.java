package gradebook.model;

import java.util.ArrayList;

/**
 * Section contains name, and a list of students who enrolled
 *
 * @author Seong Pil Yoo
 */
public class Section {
    private String sectionName;
    private ArrayList<Student> students;

    public Section(String sectionName) {
        this.sectionName = sectionName;
        this.students = new ArrayList<Student>();
    }

    public Section(String sectionName,
            ArrayList<Student> students) {
        this.sectionName = sectionName;
        this.students = students;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSectionName() {
        return this.sectionName;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public final ArrayList<Student> getStudents() {
        return this.students;
    }

    public final Score getAverageScore() {
        int receiveScores = 0;
        int totalScores = 0;

        for (Student student : students) {
            Score studentScore = student.getScore();
            receiveScores += studentScore.getReceiveScore();
            totalScores += studentScore.getTotalScore();
        }

        receiveScores /= students.size();
        totalScores /= students.size();

        return new Score(receiveScores, totalScores);
    }

    public final LetterGrade getAverageLetterGrade() {
        int letterGradeIndex = 0;
        LetterGrade result = new LetterGrade(null);

        for (Student student : students) {
            LetterGrade studentGrade = student.getLetterGrade();
            letterGradeIndex += studentGrade.getIndexOfLetterGrade();
        }

        letterGradeIndex /= students.size();

        return result.getLetterGradeOfIndex(letterGradeIndex);
    }
}
