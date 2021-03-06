package gradebook.model;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Course Test with a subject, course number, name, and prerequisite courses.
 *
 * @author Seong Pil Yoo
 */
 public class CourseTest {
    @Test
        public void testCourse() {
        String subject = "CS";
        int courseNumber = 2340;
        String name = "Object and Design";
        ArrayList<Course> prerequisiteCourses = new ArrayList<Course>();
        prerequisiteCourses.add(new Course("CS", 4400, "Data"));
        prerequisiteCourses.add(new Course("CS", 3600, "AI"));

        Course t1 = new Course(subject, courseNumber, name);
        Course t2 = new Course(subject, courseNumber, name, prerequisiteCourses);

        assertEquals(subject, t1.getSubject());
        assertEquals(courseNumber, t1.getCourseNumber());
        assertEquals(name, t1.getName());
        assertEquals(prerequisiteCourses, t2.getPrerequisiteCourses());
        Course t3 = new Course("ME", 3333, "aaa");
        t2.addPrerequisiteCourse(t3);
        prerequisiteCourses.add(t3);
        assertEquals(prerequisiteCourses, t2.getPrerequisiteCourses());

        String ns = "ME";
        int ncn = 4410;
        String nn = "Mechanical";
        Course t4 = new Course("as", 11, "ass");
        t4.setSubject(ns);
        t4.setCourseNumber(ncn);
        t4.setName(nn);
        t4.setPrerequisiteCourses(prerequisiteCourses);

        assertEquals(ns, t4.getSubject());
        assertEquals(ncn, t4.getCourseNumber());
        assertEquals(nn, t4.getName());
        assertEquals(prerequisiteCourses, t4.getPrerequisiteCourses());
    }
 }