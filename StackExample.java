import java.util.*;
import java.util.Stack;
import java.util.Collections;
class StackExample{
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        a.push(10);
        a.push(20);
        a.push(30);
        a.push(40);
        a.push(50);
        System.out.println(a);
        System.out.println(a.peek());
        a.pop();
        System.out.println(a);      
    }
}