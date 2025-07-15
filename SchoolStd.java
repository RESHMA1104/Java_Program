import java.util.*;
class School {
    String Student;
    int age;
    void display(){
        System.out.println("StudentName : " +Student);
        System.out.println("StudentAge : " +age);
    }
    void name(){
        System.out.println("Every Student Studied at Private School");
    }
}
public class SchoolStd{
    public static void main(String[] args) {
        School std = new School();
        std.Student = "Resh";
        std.age = 20;
        std.display();
        std.name();
    }
}
