import java.util.Scanner;
class reverse
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);

	
	System.out.println("Enter the string");
	String abc = sc.nextLine();
	StringBuilder hey = new StringBuilder(abc);
	hey = hey.reverse();

	System.out.println("Reverse of entered string is "+hey);
	}
}