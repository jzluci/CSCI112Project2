import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    @Test
    void emptyConstructor() {
        Department d = new Department();
        assertNotNull(d);
    }

    @Test
    void constructorName(){
        Department d = new Department("a");
        assertEquals("a", d.getName());

    }


    @Test
    void setName() {
        Department d = new Department();
        d.setName("a");
        assertEquals("a", d.getName());
    }

    @Test
    void addStudent() {
        Department d = new Department();
        d.addStudent("a", "b", "c");
        assertNotNull(d.getStudent(0));
    }

    @Test
    void addCourse() {
        Department d = new Department();
        d.addStudent("a", "b", "c");
        d.addCourse("a", "b", "b", "d", 1.0, 2.0);
        d.getStudent(0).getCourse(0);

    }
}