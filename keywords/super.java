class Add{
	int a;
	int b;
	Add()
	{
		a = 12;
		b = 34;
	}
	public int adder()
	{
		return(a+b);
	}
}
class Adding extends Add
{
	int sum;
	public void display()
	{
		System.out.println("The sum is : "+ super.adder());
	}
	public static void main(String args[])
	{
		Adding a = new Adding();
		a.display();
	}
}