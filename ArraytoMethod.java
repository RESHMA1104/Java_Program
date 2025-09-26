public class ArraytoMethod {
    public static void main(String[] args) {
        int[] students = {30, 31, 30, 28, 32, 30, 28};
        totalstudents(students); // passing arrays to method
    }
    public static void totalstudents(int[] students){
        int sum = 0;
        for(int i=0; i<students.length; i++){
            sum += students[i];
        }
        System.out.println("Total Student in the school is " +sum);
    }
}
