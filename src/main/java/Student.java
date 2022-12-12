import java.text.DecimalFormat;

public class Student {

    private String name;
    private String year;
    private String hometown;
    private double totalHoursTaken;
    private Course[] courses = new Course[20];
    private int index;
    private DecimalFormat format = new DecimalFormat("#.00");
    private double finalGPA;

    public Student(){
        name = "";
        year = "";
        hometown ="";
        totalHoursTaken = 0;
        index = 0;
    }

    public Student(String name, String year, String hometown){
        this.name = name;
        this.year = year;
        this.hometown = hometown;
        totalHoursTaken = 0;
        index = 0;
    }

    public void addCourse(String termTaken, String courseTitle, String letterGrade, double pointGrade,double creditHours){

        courses[index] = new Course(termTaken,courseTitle,letterGrade,pointGrade,creditHours);
        index++;

    }

    public void printStudent(){
        System.out.println("Student info: " + "\n"+
                "Name: "+name+"\n" +
                "Year: " +year +"\n"+
                "Hometown: " + hometown + "\n"+
                "Number of courses taken: " + index +"\n"+
                "Total hours taken: " + format.format(totalHoursTaken) + "\n" +
                "GPA: " + format.format(finalGPA));
    }

    public void printCourses(){
        for(int i = 0; i<index; i++){
            System.out.println("Student is enrolled in: " +
                    courses[i].getCourseTitle() + " in "+courses[i].getTermTaken() +". Course credit hours are: "+ courses[i].getCreditHours() + ". Student received the grade: " + courses[i].getLetterGrade() + " for a GPA value of " + courses[i].getPointGrade() +".");
        }
    }

    public Course getCourse(int index){
        return courses[index];
    }

    //loops through the courses array, multiplies the point grade value by the credit hour for the class, adds that value to the totalpointgrade variable,
    //then divides by the total hours taken to get the finalGPA
    public double calculateGPA(){
        double totalPointGrade = 0.0;

        for (int i =0; i < index ; i++){
            totalPointGrade += courses[i].getPointGrade()* courses[i].getCreditHours();
            totalHoursTaken += courses[i].getCreditHours();
        }

        finalGPA = totalPointGrade/totalHoursTaken;



        return finalGPA;

    }

    public void sortByGrade(){
        int indexOfLargestValue;
        Course largestValue;

        for (int i =0; i < index-1; i++){
            indexOfLargestValue = i;
            largestValue = courses[i];

            for (int j= i+1; j<index; j++){
                if (courses[j].getPointGrade()>largestValue.getPointGrade()){
                    largestValue = courses[j];
                    indexOfLargestValue =j;
                }
            }
            courses[indexOfLargestValue]= courses[i];
            courses[i] = largestValue;
        }
    }

    public void printAs(){
        System.out.println(name + " has recieved an A in the following classes: ");
        int tracker = 0;
        for (int i = 0; i < index; i++){
            if (courses[i].getPointGrade() == 4.0){
                System.out.println(courses[i].toString());
                tracker++;
            }
        }
        if (tracker == 0){
            System.out.println("None");
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public double getFinalGPA() {
        return finalGPA;
    }

    public double getTotalHoursTaken() {
        return totalHoursTaken;
    }
    public Course[] getCourses(){
        return courses;
    }

}
