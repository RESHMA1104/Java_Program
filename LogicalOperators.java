public class LogicalOperators {
    // used to combine multiple conditions
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 5;
        int num3 = 2;
        boolean result = num1 > num2 && num2 > num3;
        boolean result_1 = num1 < num2 || num2 < num3;
        boolean result_2 = num1 < num2 != num2 > num3;
        System.out.println(result);
        System.out.println(result_1);
        System.out.println(result_2);
    }
}
