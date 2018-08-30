import java.util.Scanner;
class Add
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int m = Integer.parseInt(a);
		int n = Integer.parseInt(b);
		int x = m + n;
		System.out.println("The sum is: "+x);
	}
}                                                        