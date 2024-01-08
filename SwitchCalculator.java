

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		  
		int a,b,c,ch;
		System.out.print("Enter any two number: ");
		Scanner s=new Scanner(System.in);
		
		a=s.nextInt();
		b=s.nextInt();
		System.out.print("Enter your choice");
	    ch=s.nextInt();
	    
	    switch(ch)
	    {
	       case 1: c=a+b;
	       System.out.print("addition"+c);
	          break;
	       
	       case 2: c=a-b;
	       System.out.print("subtract"+c);
	          break;
	       
	       case 3: c=a*b;
	       System.out.print("multiple"+c);
	          break;
	       
	       
	       case 4: c=a/b;
	       System.out.print("division"+c);
	          break;
	       
	       case 5: c=a%b;
	       System.out.print("remainder"+c);
	          break;
	       default:System.out.print("invalid choice");   
	    }
		

	}

}
