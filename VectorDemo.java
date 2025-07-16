import java.util.*;
class VectorDemo {
    //Synchronized
    public static void main(String[] args) {
        Vector al = new Vector();
        System.out.println("Initial size of vectorList:" +al.size());
        al.add("C");
        al.add("A");
        al.add(6);
        al.add(6);
        al.add("B");
        al.add("D");
        al.add("D");
        al.add("F");
        al.add("A");
        al.add("A2");
        System.out.println("Size of vectorList after additions:"+al.size());
        System.out.println(al);
        al.remove(2);
        al.remove("D");
        System.out.println("Size of vectorList after deletions:"+al.size());
        System.out.println(al);
    }
}
