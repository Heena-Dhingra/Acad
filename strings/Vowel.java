import java.util.Scanner;
class Vowel
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string");
		String str = sc.nextLine();

		str = str.replaceAll("[AEIOUaeiou]","");
		System.out.println("Final result: "+str);
	}
}