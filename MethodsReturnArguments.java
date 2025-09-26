/* 
// Without Return With Arguments
public class MethodsReturnArguments {
    public static void meow(String name){
        System.out.println("Hi Meow, This is your friend " + name + " Happy to see you");
    }
    public static void main(String[] args) {
        meow("Reshma!");
    }
}
*/
// With return Without Argument
public class MethodsReturnArguments {
    public static String name(){
        return "Reshma";
    }
    public static void main(String[] args) {
        String Student = name();
        System.out.println(Student);
    }
}