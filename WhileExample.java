public class WhileExample {
    public static void main(String[] args){
        int num = 1;
        while(num <= 5){
            System.out.println("Fruit is Good for Health "+num);// This will print the statement plus number until the condition is true
            num++;
        }
        System.out.println("Junk Food is not Good for Health");// It will print after the block of code executed 5 times
    }
}
