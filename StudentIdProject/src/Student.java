import java.util.ArrayList;

public class Student {

    private static int lastId = 0;
    private String firstName;
    private int studentId;
    private ArrayList<Course> courseList;


    public static int generateId(){
        int nextId = lastId++;
        return nextId;
    }

    public Student(String name){
        firstName = name;
        studentId = generateId();
        courseList = new ArrayList<Course>();
    }

    public int getStudentId(){
        return studentId;
    }

    public String getFirstName(){
        return firstName;
    }
    
    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public String toString (){
        return "Name: "+ firstName +", Student ID: "+ studentId;
    }

    public void addCourse(String courseName, int grade){
        Course c = new Course(courseName, grade);
        courseList.add(c);
    }

    public double findAvgGrade(){
        double sumSoFar = 0;
        for(int i=0;i<courseList.size();i++){
            Course c = courseList.get(i);
            sumSoFar = sumSoFar + c.getGrade();
        }
//i add this
        double avgGrade = sumSoFar/courseList.size();
        return avgGrade;



    }

    public void printOutAll(){
        for(int o=0; o<courseList.size(); o++)
        System.out.println(courseList.get(o));
    }

}
