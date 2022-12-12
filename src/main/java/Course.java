public class Course {

    private String termTaken;
    private String courseTitle;
    private String letterGrade;
    private double pointGrade;
    private double creditHours;

    public Course(){
        termTaken = "";
        courseTitle = "";
        letterGrade = "";
        pointGrade = 0.0;
        creditHours = 0.0;

    }

    public Course(String termTaken, String courseTitle, String letterGrade, double pointGrade, double creditHours){
        this.termTaken = termTaken;
        this.courseTitle = courseTitle;
        this.letterGrade = letterGrade;
        this.pointGrade = pointGrade;
        this.creditHours = creditHours;
    }

    public String getTermTaken() {
        return termTaken;
    }

    public void setTermTaken(String termTaken) {
        this.termTaken = termTaken;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public double getPointGrade() {
        return pointGrade;
    }

    public void setPointGrade(double pointGrade) {
        this.pointGrade = pointGrade;
    }

    public double getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(double creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String   toString() {
        return "Course{" +
                "termTaken='" + termTaken + '\'' +
                ", courseTitle='" + courseTitle + '\'' +
                ", letterGrade='" + letterGrade + '\'' +
                ", pointGrade=" + pointGrade +
                ", creditHours=" + creditHours +
                '}';
    }
}
