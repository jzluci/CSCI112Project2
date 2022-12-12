/*
Name: James Zachary Luci
Current Date: 10/4/2022
Sources Consulted: Referenced lecture notes and labs. Talked with my classmate Jaysun to work through some of the logic of the sort test in the student test class.
We did not copy or share code.

By submitting this work, I attest that it is my original work and that I did
not violate the University of Mississippi academic policies set forth in the
M book.
*/


import javax.management.DescriptorAccess;

public class P2Driver {
    public static void main(String[] args) {
        Department department = new Department("English");

        //student 1
        department.addStudent("Melissa", "Freshman", "Los Angeles");
        department.addCourse("Melissa", "fall", "English 101", "A", 4.0, 3.0);
        department.addCourse("Melissa", "fall", "Public Speaking", "B", 3.0, 3.0);
        department.addCourse("Melissa", "fall", "Calculus 1", "C", 2.0, 4.0);
        department.addCourse("Melissa", "fall", "Creative Writing", "A", 4.0, 3.0);
        department.getStudent(0).calculateGPA();

        //student 2
        department.addStudent("Maddie", "Sophomore", "Annapolis");
        department.addCourse("Maddie", "fall", "English 203", "A", 4.0, 3.0);
        department.addCourse("Maddie", "fall", "Biology 201", "C", 2.0, 4.0);
        department.addCourse("Maddie", "fall", "Physics 210", "B", 3.0, 4.0);
        department.addCourse("Maddie", "fall", "Engineering 101", "A", 4.0, 2.0);
        department.addCourse("Maddie", "fall", "Intro to Poetry", "A", 4.0, 3.0);
        department.getStudent(1).calculateGPA();

        //student 3
        department.addStudent("Ian", "Junior", "New Orleans");
        department.addCourse("Ian", "fall", "Western Short Form Literature in the 18th Century", "A", 4.0, 3.0);
        department.addCourse("Ian", "fall", "Accounting 342", "A", 4.0, 3.0);
        department.addCourse("Ian", "fall", "Statistics 310", "B", 3.0, 3.0);
        department.addCourse("Ian", "fall", "Pre-Revolutionary American History", "B", 3.0, 3.0);
        department.addCourse("Ian", "fall", "Linear Algebra", "C", 2.0, 4.0);
        department.addCourse("Ian", "fall", "Intro to Film", "A", 4.0, 2.0);
        department.getStudent(2).calculateGPA();

        //student 4
        department.addStudent("Alia", "Senior", "Denver");
        department.addCourse("Alia", "fall", "20th Century European History", "B", 3.0, 3.0);
        department.addCourse("Alia", "fall", "Marketing 405", "B", 3.0, 3.0);
        department.addCourse("Alia", "fall", "Consumer Psychology", "B", 3.0, 3.0);
        department.addCourse("Alia", "fall", "Microeconomics", "B", 3.0, 3.0);
        department.addCourse("Alia", "fall", "Statistics", "B", 3.0, 3.0);
        department.addCourse("Alia", "fall", "Advertising 370", "B", 3.0, 3.0);
        department.addCourse("Alia", "fall", "Rhetoric in Modern Media", "B", 3.0, 3.0);
        department.getStudent(3).calculateGPA();



        //1st round of department printing
        department.printDepartment();

        //break
        System.out.println("The course data is now sorted in descending order by grade point value for all students." + "\n");

        department.getStudent(0).sortByGrade();
        department.getStudent(1).sortByGrade();
        department.getStudent(2).sortByGrade();
        department.getStudent(3).sortByGrade();

        //2nd round of department printing
        department.printDepartment();

        //3rd round of printing
        department.getStudent(0).printAs();
        department.getStudent(1).printAs();
        department.getStudent(2).printAs();
        department.getStudent(3).printAs();

        System.out.println("Goodbye!");



    }
}
