/* 
class Student{
    // constructor - special method in java which is used to intialize object and it is called automatically when an object is created.
    Student(){
        System.out.println("Dog is the pet animal of all over India.");
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        Student s = new Student(); // constructor will be called here - when new obj() is created, java calls the constructor.
    }
}
*/

/*
// Default Constructor - has no parameters, is either written by you or automatically provided by java when we dont write any constructor.
class Student{
    String name;
    int age;
    Student(){ //default constructor
        name = "Reshma";
        age = 20;
    }
    void display(){
        System.out.println("Student name is : " +name);
        System.out.println("Student age is : " +age);
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
*/

/*
// Parameterized Constructor
class Student{
    String name;
    int age;
    Student(String n, int a){ // parameterized constructor - takes arguments to initialize different values for different objects
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
    }
}
public class ConstructorExample {
    public static void main(String[] args) { // Used to set values during object creation
        Student s = new Student("Reshma", 20); // Calls parameterized constructor, assigns values
        Student s1 = new Student("Vithya", 20); // Calls the same constructor with different values
        s.display();
        s1.display();
    }
}
*/

// Copy Constructor
class Student{
    String name;
    int age;
    Student(String n, int a){ // parameterized constructor 
        name = n;
        age = a;
    }
    Student(Student s){ // copy constructor
        name = s.name;
        age = s.age;
    }
    void display(){
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
    }
}
public class ConstructorExample {
    public static void main(String[] args) {
        Student s = new Student("Reshma", 20); // Calls parameterized constructor, assigns values
        Student s1 = new Student(s); // creates a new object using another object of the same class
        s.display();
        s1.display();
    }
}
// new Student(s) - Calls the copy constructor and copies values
// s1 is a new object, Separate memory than s1, but with same values