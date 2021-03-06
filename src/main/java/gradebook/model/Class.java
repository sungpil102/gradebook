package gradebook.model;

import java.util.ArrayList;

/**
 * Class contains Sections
 * And reports the average score and letter grade for the course.
 * Extends course class
 *
 * @author Seong Pil Yoo
 */
public class Class extends Course {
    private ArrayList<Section> sections;

    public Class(String subject, int courseNumber,
            String name) {
        super(subject, courseNumber, name);
        this.sections = new ArrayList<Section>();
    }

    public Class(String subject, int courseNumber,
            String name,
            ArrayList<Course> prerequisiteCourses) {
        super(subject, courseNumber, name, prerequisiteCourses);
        this.sections = new ArrayList<Section>();
    }

    public Class(String subject, int courseNumber,
            String name,
            ArrayList<Course> prerequisiteCourses,
            ArrayList<Section> sections) {
        super(subject, courseNumber, name, prerequisiteCourses);
        this.sections = sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }

    public void addSection(Section section) {
        sections.add(section);
    }

    public ArrayList<Section> getSections() {
        return this.sections;
    }

    public Score getAverageScore() {
        int receiveScores = 0;
        int totalScores = 0;

        for (Section section : sections) {
            Score sectionScore = section.getAverageScore();
            receiveScores += sectionScore.getReceiveScore();
            totalScores += sectionScore.getTotalScore();
        }

        receiveScores /= sections.size();
        totalScores /= sections.size();

        return new Score(receiveScores, totalScores);
    }

    public LetterGrade getAverageLetterGrade() {
        int letterGradeIndex = 0;
        LetterGrade result = new LetterGrade(null);

        for (Section section : sections) {
            LetterGrade sectionGrade = section.getAverageLetterGrade();
            letterGradeIndex += sectionGrade.getIndexOfLetterGrade();
        }

        letterGradeIndex /= sections.size();

        return result.getLetterGradeOfIndex(letterGradeIndex);
    }
}
