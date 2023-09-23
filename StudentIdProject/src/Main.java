public class App {
    public static void main(String[] args) throws Exception {
        Student s = new Student("Shira");
        System.out.println(s);

        s.addCourse("Computer Programming", 12);
        s.addCourse("Eating Pancakes", 7);
        s.printOutAll();
        System.out.println("Average Grade: " + s.findAvgGrade());


        Student t = new Student("Tamir");
        System.out.println(t);

        t.addCourse("Science", 10);
        t.addCourse("Annoying", 5);
        t.printOutAll();
        System.out.println("Average Grade: " + t.findAvgGrade());


    }
}
