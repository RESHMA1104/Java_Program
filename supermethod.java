class Grass{
    void green()
    {
        System.out.println("The Grass is green in colour");
    }
}
class Fruits extends Grass{
    void colour()
    {
        //printing statements are based on where the keywords are used for call the method
        super.green();
        System.out.println("The Fruits are in colourful");
    }
}
class supermethod{
    public static void main(String[] args)
    {
        Fruits x = new Fruits();
        x.colour();
    }
}