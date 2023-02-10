package day9;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student(50111,"Vasya");
        Teacher teacher = new Teacher("history", "Bob");
        System.out.println(student.groupNumber);
        System.out.println(teacher.subject);
        student.printInfo();
        teacher.printInfo();
    }
}
