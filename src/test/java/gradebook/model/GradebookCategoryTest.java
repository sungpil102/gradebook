package gradebook.model;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Class Test with a subject, course number, name, and prerequisite courses.
 *
 * @author Seong Pil Yoo
 */
 public class GradebookCategoryTest{
        @Test
        public void testCourse() {
        GradebookCategory gc= new GradebookCategory("quiz", 20);
        assertEquals("quiz", gc.getName());
        assertEquals(20, gc.getWeight());
        }
 }