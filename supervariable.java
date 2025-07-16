class Dragon{
    int a = 10;
    void heat()
    {
        System.out.println("This is Dragon Class produce heat()");
    }
}
class Dragonfly extends Dragon{
    int a = 20;
    void fly()
    {
        System.out.println("This is Dragonfly class produce fly()"+a);
        System.out.println("This is Dragon Class produce heat()"+super.a);
    }
}
class supervariable
{
    public static void main(String[] args){
        Dragonfly x = new Dragonfly();
        x.fly();
    }
}