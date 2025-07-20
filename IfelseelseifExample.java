import java.util.*;
public class IfelseelseifExample {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int marks = std.nextInt();
        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks >= 80){
            System.out.println("Grade B");
        }
        else if(marks >= 70){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Grade D");
        }
    }
}
