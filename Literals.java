public class Literals {
    public static void main(String[] args) {
        /* 
        //Integer Literals
        int a = 10;       // decimal
        int b = 0b1010;   // binary (Java 7+)
        int c = 012;      // octal
        int d = 0x1F;     // hexadecimal
        int population = 1_000_000;
        //Floating-Point Literals
        float pi = 3.14f;     // 'f' for float
        double g = 9.8;       // default is double
        double sci = 1.23e3;     // scientific notation (1.23 × 10³ = 1230)
        //Character Literals
        char grade = 'A';
        char newline = '\n';    // escape character
        //String Literals
        String name = "Reshma";
        //Boolean Literals
        boolean isActive = true;
        boolean isVerified = false;
        //Null Literals
        String msg = null;  
        */
        int age = 21;
        float height = 5.6f;
        char initial = 'R';
        String name = "Reshma";
        boolean isStudent = true;
        String course = null;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Initial: " + initial);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Course: " + course);
    }
}
