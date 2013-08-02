package gradebook.model;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Class Test with a subject, course number, name, and prerequisite courses.
 *
 * @author Seong Pil Yoo
 */
 public class GradebookItemTest{
        @Test
        public void testCourse() {
        GradebookCategory gc= new GradebookCategory("quiz", 20);
        String name = "quiz2";
        Score score = new Score(80, 100);
        GradebookItem gi= new GradebookItem(name, gc, score);

        assertEquals(name, gi.getName());
        assertEquals(score, gi.getScore());
        assertEquals(gc, gi.getCategory());
        }
 }