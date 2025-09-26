/* Method Syntax
returnType methodName(parameters) {
     method body 
}
*/
// Static Method
// This is an example of Without Return Without Arguments
public class MethodsExample {
    public static void meow(){
        System.out.println("Meow is a child of cat!!!");
    }
    public static void main(String[] args) {
        meow();
        MethodsExample.meow();
    }
}
/* 
//Non-Static Method
public class MethodsExample{
    public void meow(){
        System.out.println("Meow is a child of Cat!!!");
    }
    public static void main(String[] args) {
        MethodsExample c = new MethodsExample();
        c.meow();
    }
}
*/
/*
Math.random(); // returns a random value
Math.PI; // returns the value of Pi
*/