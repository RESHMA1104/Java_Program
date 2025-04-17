//Operators
/*public class Operators {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 2;
        int result = num1 + num2;
        System.out.println(result);
    }
}
*/

// increment
public class Operators{
    public static void main(String[] args){
        int num = 8;
        int result = num++; // first fetch the value and then increment
        int result_1 = ++num; // first increment and then fetch the value
        int result_2 = num--; // output : 8
        int result_3 = --num; // output : 7
        System.out.println(result);
        System.out.println(result_1);
        System.out.println(result_2);
        System.out.println(result_3);
    }
}