public class Thisday {
    int id;
    String name;
    Thisday(int id, String name){
        this.id = id;
        this.name = name;
    }
    void date()
    {
        System.out.println(id + "" + name);
    }
    public static void main(String[] args) {
        Thisday a1 = new Thisday(123, "reshma");
        Thisday a2 = new Thisday(124, "resh");
        a1.date();
        a2.date();
    }
}
