public class Instance {
    String s = "";
    public void test(String s){
        this.s = s; 
    }
    public static void main(String[] args) {
        Instance c = new Instance();
        c.test("Today is Monday.");
        System.out.println(c.s);
    }
}