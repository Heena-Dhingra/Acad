import java.util.Scanner;
class Rectangle
{
	int l,b,area;

	Scanner sc = new Scanner(System.in);

	public void getData()
	{
		System.out.println("Enter length:");
		l = sc.nextInt();
		System.out.println("Enter breadth:");
		b = sc.nextInt();
	}
	public void CalculateArea()
	{
		area = l*b;
		System.out.println("Area of rectangle is: "+area);
	}
	

}
class area
{
	public static void main(String args[])
	{
		Rectangle r = new Rectangle();
		r.getData();
		r.CalculateArea();
	}
}