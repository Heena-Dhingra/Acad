class Add
{
	int a;
	int b;
	int sum;
	Add(int a)
	{
		this.a=a;
		sum =  a+b;
	}
	Add(int a,int b)
	{
		this(a);
		this.b=b;
		sum = a+b;
	}
	public void display()
	{
		System.out.println("Sum is: "+sum);
	}
	public static void main(String args[])
	{
		Add a = new Add(3,4);
		a.display();

	}

}