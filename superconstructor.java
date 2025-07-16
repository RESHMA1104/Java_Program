class Piegeon{
    Piegeon(int a,int b){
        System.out.println("This is piegeon count"+(a+b));
    }
}
class Sparrow extends Piegeon{
    Sparrow(int b)
    {
        super(4,8);
        System.out.println("This is Sparrow count"+b);
    }
}
//it can automatically call when an object is created which is known as constructor
class superconstructor{
    public static void main(String[] args)
    {
        new Sparrow(7);

    }
}