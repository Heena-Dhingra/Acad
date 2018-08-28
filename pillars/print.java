class Display
{
	
	public void print()
	{
		System.out.println("There are no arguments.");
	}
	public void print(int a)
	{
		System.out.println("There was one int argument: "+a);
	}
	public void print(float b)
	{
		System.out.println("There was one float argument: "+b);
	}}

class Demo{
	public static void main(String args[])
	{
		Display d = new Display();

		d.print();
		d.print(10);
		d.print(20.67f);
	}
}