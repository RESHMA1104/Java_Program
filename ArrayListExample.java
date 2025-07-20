import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample{
    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        System.out.println(b);
        b.set(0, 10);
        System.out.println(b);
        System.out.println(b.size());
        System.out.println(b);
        b.clear();
        System.out.println(b);

    }
}
