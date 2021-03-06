package gradebook.model;

import java.util.ArrayList;

/**
 * Student name, Gradebook Item, Grading Scheme
 *
 * @author Seong Pil Yoo
 */
public class Student {
    private String name;
    private ArrayList<GradebookItem> grades;
    private GradingScheme scheme;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<GradebookItem>();
        this.scheme = new DefaultGradingScheme();
    }

    public Student(String name,
        ArrayList<GradebookItem> grades) {
        this.name = name;
        this.grades = grades;
        this.scheme = new DefaultGradingScheme();
    }

    public Student(String name,
        ArrayList<GradebookItem> grades,
        GradingScheme scheme) {
        this.name = name;
        this.grades = grades;
        this.scheme = scheme;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrades(ArrayList<GradebookItem> grades) {
        this.grades = grades;
    }

    public void addGrade(GradebookItem grade) {
        grades.add(grade);
    }

    public ArrayList<GradebookItem> getGrades() {
        return this.grades;
    }

    public void setGradingScheme(GradingScheme scheme) {
        this.scheme = scheme;
    }

    public Score getScore() {
        return scheme.calculateScore(grades);
    }

    public LetterGrade getLetterGrade() {
        return scheme.calculateLetterGrade(grades);
    }
}

