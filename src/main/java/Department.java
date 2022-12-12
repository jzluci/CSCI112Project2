import java.util.ArrayList;

public class Department {


    private String name;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Department(){
        name = "";
    }

    public Department(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(String name, String year, String hometown){
        students.add(new Student(name, year, hometown));
    }

    public void addCourse(String name, String termTaken, String courseTitle, String letterGrade, double pointGrade,double creditHours){
        for (int i = 0; i<students.size();i ++){
            if(name.equals(students.get(i).getName())){
                students.get(i).addCourse(termTaken,courseTitle,letterGrade,pointGrade,creditHours);
            }
        }
    }

    public Student getStudent (int index){
        return students.get(index);
    }

    public void printDepartment(){
        System.out.println("Welcome to the " + name + " department!" + "\n"+

                "Number of Students: " + students.size() + "\n");
        for (int i = 0; i < students.size(); i++){
            students.get(i).printStudent();
            students.get(i).printCourses();
            System.out.println();
        }
    }

}
