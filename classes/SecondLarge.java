import java.util.Scanner;
class SecondLarge
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,a[],max,sec_max,b[];
		a = new int[10];
		b = new int[10];

		System.out.println("Enter the arrray:");
		for(i=0;i<10;i++)
		{
			a[i] = sc.nextInt();
		} 

		max=a[0];
		sec_max=a[0];
		for(i=0;i<10;i++)
		{
			if(a[i]>max)
			{
				sec_max=max;
				max=a[i];

			}
			else if(a[i]>sec_max)
			{
				sec_max = a[i];
			}
		}

		System.out.println("Second largest number in the array is :"+sec_max);
		
	}
}