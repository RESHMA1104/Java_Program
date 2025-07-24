class ImplicitCasting 
{
	public static void main(String[] args) 
	{
		boolean a=true;
		System.out.println(a);

		String b=new Boolean(a).toString();
		System.out.println(b);
	}
}