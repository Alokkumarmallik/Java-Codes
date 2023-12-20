import java.util.Scanner;
class PrimeOrNot
{
	public static void main(String[] args) {
		int n,count=0;
		System.out.print("Enter any number: ");
		Scanner r=new Scanner(System.in);

		n=r.nextInt();

		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
			System.out.print("prime no");
		else 
			System.out.print("Not prime no");
	}
}