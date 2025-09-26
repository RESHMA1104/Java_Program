/*
// Public - Accessible from anywhere
public class AccessModifiers {
    public String hihello = "Hi, This is Simba from LionKing.";
    public void catName(){
        System.out.println("Hlo kutty! "+hihello);
    }
    public static void main(String[] args){
        AccessModifiers catfamily = new AccessModifiers();
        catfamily.catName();
    }
}
*/
//private - Accessible only within the same class
public class AccessModifiers{
    private String hihello = "Hi, This is Simba from LionKing."; // This will print because, it is accessed within the same class
    private void catName(){
        System.out.println("Hlo Son! "+hihello);
    }
    public static void main(String[] args) {
        AccessModifiers catfamily = new AccessModifiers();
        catfamily.catName();
    }
}
