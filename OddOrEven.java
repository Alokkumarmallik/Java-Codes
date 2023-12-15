package JavaBasic;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		int n;
		System.out.print("Enter any number: ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		if(n%2==0)
		{
			System.out.print("Even no");
		}
		else
		{
			System.out.print("odd no");
		}

	}

}
