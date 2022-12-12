import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void emptyConstructor() {
        Course c = new Course();
        assertNotNull(c);
    }

    @Test
    void termTakenTest() {
        Course c = new Course("spring","", "", 0.0, 0.0);
        assertEquals("spring", c.getTermTaken());

    }

    @Test
    void courseTitleTest() {
        Course c = new Course("","English", "", 0.0, 0.0);
        assertEquals("English", c.getCourseTitle());
    }

    @Test
    void letterGradeTest() {
        Course c = new Course("","", "A+", 0.0, 0.0);
        assertEquals("A+", c.getLetterGrade());
    }

    @Test
    void pointGradeTest() {
        Course c = new Course("","", "", 4.0, 0.0);
        assertEquals(4.0, c.getPointGrade());
    }

    @Test
    void creditHoursTest() {
        Course c = new Course("","", "", 0.0, 3.0);
        assertEquals(3.0, c.getCreditHours());
    }

    @Test
    void getTermTaken() {

    }

    @Test
    void setTermTaken() {
        Course c = new Course();
        c.setTermTaken("summer");
        assertEquals("summer", c.getTermTaken());

    }

    @Test
    void getCourseTitle() {
    }

    @Test
    void setCourseTitle() {
        Course c = new Course();
        c.setCourseTitle("Spanish 101");
        assertEquals("Spanish 101", c.getCourseTitle());
    }

    @Test
    void getLetterGrade() {
    }

    @Test
    void setLetterGrade() {
        Course c = new Course();
        c.setLetterGrade("F-");
        assertEquals("F-", c.getLetterGrade());
    }

    @Test
    void getPointGrade() {
    }

    @Test
    void setPointGrade() {
        Course c = new Course();
        c.setPointGrade(1.0);
        assertEquals(1.0, c.getPointGrade());

    }

    @Test
    void setCreditHours() {
        Course c = new Course();
        c.setCreditHours(1.0);
        assertEquals(1.0, c.getCreditHours());

    }
}