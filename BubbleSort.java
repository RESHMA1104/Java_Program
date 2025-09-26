// Bubble sort - Bubble Sort is one of the simplest sorting algorithms. 
// It repeatedly compares adjacent elements in an array and swaps them if they are in the wrong order.
// After each pass, the largest element "bubbles up" to the end of the array. That’s why it’s called Bubble Sort.
// Time complexity : O(n2)
// Space complexity : O(1)
public class BubbleSort {
    public static void main(String[] args) {
        int[] num = {7, 4, 1, 9, 3, 5};
        // instead of num.length directly assigned in outerloop we can used to store it in a variable and use it.
        // n = num.length
        for(int i=0; i<num.length; i++){ // n-1. This outer loop is used as a counter like number of passes
            for(int j=0; j<num.length-1-i; j++){ // here use n-1-i. Inner loops are used to compare adjacent values
                if(num[j] > num[j+1]){
                    //swap elements
                    int temp = num[j]; // store num[j] into temp
                    num[j] = num[j+1]; // copy num[j+1] into num[j]
                    num[j+1] = temp; // copy temp into num[j+1]
                }
            }
        }
        System.out.println("Sorted Array : ");
        for(int arr : num){
            System.out.print(arr + " "); // store sorted array in a variable arr.
        }
    }
}