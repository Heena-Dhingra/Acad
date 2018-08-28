import java.util.Scanner;
class complexNumber
{
	int real,img;

	Scanner sc = new Scanner(System.in);

	public void Display()
	{
		System.out.println("Enter real part:");
		real = sc.nextInt();
		System.out.println("Enter imaginary part:");
		img = sc.nextInt();

		System.out.println("Entered complex number is: "+real+"+"+img+"i");
	}
}
class Complex
{
	public static void main(String args[])
	{
		complexNumber c = new complexNumber();
		c.Display();
	}
}