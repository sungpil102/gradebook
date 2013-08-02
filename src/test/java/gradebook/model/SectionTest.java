package gradebook.model;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Section Test with a subject, course number, name, and prerequisite courses.
 *
 * @author Seong Pil Yoo
 */
 public class SectionTest{
        @Test
        public void testCourse() {
        GradebookCategory gc= new GradebookCategory("quiz", 20);
        String name = "quiz2";
        Score score = new Score(80, 100);
        GradebookItem gi= new GradebookItem(name, gc, score);

        name = "Seong Pil";
        Student sd1 = new Student(name);
        sd1.addGrade(gi);

        name = "Section 1";
        Section s1 = new Section(name);
        s1.addStudent(sd1);
        ArrayList<Student> sttt = new ArrayList<Student>();
        sttt.add(sd1);

        assertEquals(name, s1.getSectionName());
        assertEquals(sttt, s1.getStudents());
        }
 }