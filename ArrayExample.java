public class ArrayExample {
    public static void main(String[] args) {
       int[] marks;
       marks = new int[5];
       //int[] marks = new int[5]  // datatype[] variable name = { values }
       marks[0] = 20;
       marks[1] = 40;
       marks[2] = 60;
       marks[3] = 80;
       marks[4] = 100;
      //int[] marks = {20, 40, 60, 80, 100}
       for(int i=0; i<=marks.length-1; i++){
        System.out.println("Marks "+i+ " is " +marks[i]);
       } 
       System.out.println(marks[0]);
       System.out.println(marks[1]);
    }
}