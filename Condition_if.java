import java.util.Scanner;

public class Condition_if {

	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age: ");
		Scanner r=new Scanner(System.in);
		
		age=r.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			System.out.println("Not Eligible for vote");
		}

	}

}
