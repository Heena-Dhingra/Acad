class A
{
	static String a;
	static{
		a="Welcome!";
		System.out.println("This is static block");
	}
}
class B
{
	public static void main(String args[])
	{
		System.out.println(A.a);
	}
}