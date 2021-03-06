package gradebook.model;

import java.util.ArrayList;

/**
 * Course with a subject, course number, name, and prerequisite courses.
 *
 * @author Seong Pil Yoo
 */
public class Course {
    private String subject;
    private int courseNumber;
    private String name;
    private ArrayList<Course> prerequisiteCourses;

    public Course(String subject, int courseNumber,
            String name) {
        this.subject = subject;
        this.courseNumber = courseNumber;
        this.name = name;
        prerequisiteCourses = new ArrayList<Course>();
    }

    public Course(String subject, int courseNumber,
            String name,
            ArrayList<Course> prerequisiteCourses) {
        this.subject = subject;
        this.courseNumber = courseNumber;
        this.name = name;
        this.prerequisiteCourses = prerequisiteCourses;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getCourseNumber() {
        return this.courseNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrerequisiteCourses(
        ArrayList<Course> prerequisiteCourses) {
        this.prerequisiteCourses = prerequisiteCourses;
    }

    public void addPrerequisiteCourse(Course course) {
        this.prerequisiteCourses.add(course);
    }

    public ArrayList<Course> getPrerequisiteCourses() {
        return prerequisiteCourses;
    }
}

