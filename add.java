class addition
{
    void m1(int a, int b)
    {
        int c=a+b;
        System.out.println("The Add Result is "+c);
    }
}
class add
{
    public static void main(String[] args)
    {
        addition x=new addition();
        x.m1(8,4);
    }
}