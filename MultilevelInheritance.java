// Multilevel Inheritance - Grandparent --> Parent --> Child
// GrandParent class
class Animal{
    void Lion(){
        System.out.println("Lion is the king of the Forest");
    }
}
// Parent class
class Birds extends Animal{
    void Sparrow(){
        System.out.println("Sparrow is the cutest Birds in the Whole Birds Family");
    }
}
// child class
class Dog extends Birds{
    void puppy(){
        System.out.println("Dog is one of the Loyal Animal in the Whole Universe, No one can beat it.");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Dog s = new Dog();
        s.Lion(); // Inherited from Animal class
        s.Sparrow(); // Defined in Birds
        s.puppy();
    }
}
