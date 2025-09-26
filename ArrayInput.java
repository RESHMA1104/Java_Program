import java.util.*;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int a = sc.nextInt();
        System.out.println("Enter the "+a+ " Integers : ");
        int[] marks = new int[a];
        for(int i=0; i<a; i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0; i<marks.length; i++){
            System.out.println("Marks " +i+ " : " +marks[i]);
        }
    }
}
