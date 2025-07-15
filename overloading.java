class hen{
    void m1(int a, int b){
        int c=a+b;
        System.out.println("The add result is:" +c);
    }
    void m1(int a, int b, int d){
        int c=a+b+d;
        System.out.println("The add result is:" +c);
    }
}
class overloading{
    public static void main(String[] args){
        hen x=new hen();
        x.m1(4,8,7);
    }
}