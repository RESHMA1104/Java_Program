// When one class inherits from two or more classes, it's called Multiple Inheritance. In java MI can achieve through Interface.
interface Animal{
    void Sound(); // Methods Declaration only. Don't define them(Without body).
}
interface Lion{
    void Roam();
}
class Dog implements Animal, Lion{ // A class implements an interface and agrees to provide the methods for those classes.
    public void Sound(){
        System.out.println("Animals Sounds hits different.");
    }
    public void Roam(){
        System.out.println("Lion is the King of the Forest.");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.Sound();
        d.Roam();
    }
}