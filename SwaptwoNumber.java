
import java.util.Scanner;
class SwaptwoNumber
{
	public static void main(String[] args) {
		int a,b;
		System.out.print("Enter any two Number: ");
		Scanner r=new Scanner(System.in);

		
		a=r.nextInt();
		b=r.nextInt();
		System.out.print("Before swap two Number "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.print("After swap two Number "+a+" "+b);
	}
}