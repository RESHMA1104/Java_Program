import java.util.*;
public class ArrayIsSorted {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array : ");
    int n = sc.nextInt();
    System.out.println("Enter the "+n+ " elements in an array : ");
    int[] num = new int[n];
    for(int i=0; i<n; i++){
        num[i] = sc.nextInt();
    }
    boolean isSorted = true;
    for(int i=0; i<n-1; i++){
        if(num[i] > num[i+1]){
            isSorted = false;
            break;
        }
    }
    if(isSorted){
        System.out.println("Array is Sorted");
    }
    else{
        System.out.println("Array is not sorted");
    }
   } 
}