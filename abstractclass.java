abstract class Flower{
    public void numberofroses()
    {
        System.out.println("Three roses");
    }public void numberofpetals()
    {
        System.out.println("Fifty petals");
    }
}
class Animal extends Flower{ // inheritance method are used to create object from child class
    public void numberoflions()
    {
        System.out.println("Four lions");
    }
}
class Tiger extends Flower{
    public void numberofTiger()
    {
        System.out.println("Six tiger");
    }
}
public class abstractclass{
    public static void main(String[] args) {
        //object won't create for class directly
        Animal objAnimal = new Animal();
        Tiger objTiger = new Tiger();
        System.out.println("--------------------");
        objAnimal.numberofroses();
        objAnimal.numberofpetals();
        objAnimal.numberoflions();
        System.out.println("---------------------");
        objTiger.numberofroses();
        objTiger.numberofpetals();
        objTiger.numberofTiger();
        System.out.println("-----------------------");;
    }

}