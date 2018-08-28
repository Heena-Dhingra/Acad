import java.util.Scanner;
class wave
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int a[] = new int[10];
		int i=0,temp;

		System.out.println("Enter the array:");
		for(i=0;i<10;i++)
		{
			a[i] = sc.nextInt();
		}

		for(i=0;i<10;i+=2n)
		{
			temp = a[i];
			a[i]=a[i+1];
			a[i+1]=temp;

			System.out.print(a[i]+" "+a[i+1]+" ");

			
		}


	}
}