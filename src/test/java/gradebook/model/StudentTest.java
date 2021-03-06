package gradebook.model;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

/**
 * Student Test with a subject, course number, name, and prerequisite courses.
 *
 * @author Seong Pil Yoo
 */
 public class StudentTest{
        @Test
        public void testCourse() {
        GradebookCategory gc= new GradebookCategory("quiz", 20);
        String name = "quiz2";
        Score score = new Score(80, 100);
        GradebookItem gi= new GradebookItem(name, gc, score);

        name = "Seong Pil";
        Student sd1 = new Student(name);
        sd1.addGrade(gi);
        ArrayList<GradebookItem> temp = new ArrayList<GradebookItem>();
        temp.add(gi);
        assertEquals(name, sd1.getName());
        assertEquals(temp, sd1.getGrades());
        assertEquals(score.getReceiveScore(), sd1.getScore().getReceiveScore());
        LetterGrade letter = new LetterGrade("B");
        assertEquals(letter.getLetterGrade(), sd1.getLetterGrade().getLetterGrade());
        }
 }