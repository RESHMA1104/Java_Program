interface Leopard
{

}
class Lion{
    void loves(){
        System.out.println("Lion loves Nature");
    }
}
class Tiger extends Lion{
    void eats(){
        System.out.println("Tiger eats Zebra");
    }
}
class inheritance{
    public static void main(String[] args){
        Tiger x=new Tiger();
        x.loves();
        x.eats();
    }
}
 