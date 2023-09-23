public class Course {

    private String courseName;
    private int grade;

    public Course(String cName, int cGrade) {
        courseName = cName;
        grade = cGrade;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getGrade() {
        return grade;
    }

    public String toString(){
        return courseName;
    }
    
}
