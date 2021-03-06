package gradebook.model;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Class Test with a subject, course number, name, and prerequisite courses.
 *
 * @author Seong Pil Yoo
 */
 public class ClassTest{
        @Test
        public void testCourse() {
        String subject = "CS";
        int courseNumber = 2340;
        String name = "Object and Design";
        ArrayList<Course> prerequisiteCourses = new ArrayList<Course>();
        prerequisiteCourses.add(new Course("CS", 4400, "Data"));
        prerequisiteCourses.add(new Course("CS", 3600, "AI"));

        Class c1 = new Class(subject, courseNumber, name);
        Class c2 = new Class(subject, courseNumber, name, prerequisiteCourses);

        assertEquals(subject, c1.getSubject());
        assertEquals(courseNumber, c1.getCourseNumber());
        assertEquals(name, c1.getName());
        assertEquals(prerequisiteCourses, c2.getPrerequisiteCourses());
        
        GradebookCategory gc= new GradebookCategory("quiz", 20);
        name = "quiz2";
        Score score = new Score(80, 100);
        GradebookItem gi= new GradebookItem(name, gc, score);

        name = "Seong Pil";
        Student sd1 = new Student(name);
        sd1.addGrade(gi);

        name = "Section 1";
        Section s1 = new Section(name);
        s1.addStudent(sd1);
        ArrayList<Section> check = new ArrayList<Section>();
        check.add(s1);
        
        c2.addSection(s1);
        assertEquals(check, c2.getSections());
        }
 }