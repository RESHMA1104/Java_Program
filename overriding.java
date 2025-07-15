class Lion{
    void loves(){
        System.out.println("Lion loves Nature");
    }
}
class Tiger extends Lion{
    void loves(){
        System.out.println("Lion loves Nature");
    }
}
class overriding{
    public static void main(String[] args){
        Tiger x=new Tiger();
        x.loves();
    }
}
 