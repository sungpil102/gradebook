package gradebook.model;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Score Test with a subject, course number, name, and prerequisite courses.
 *
 * @author Seong Pil Yoo
 */
 public class ScoreTest{
        @Test
        public void testCourse() {
        Score score = new Score(80, 100);
        assertEquals(80, score.getReceiveScore());
        assertEquals(100, score.getTotalScore());
        }
 }