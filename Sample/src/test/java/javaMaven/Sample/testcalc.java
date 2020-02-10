package javaMaven.Sample;

import java.util.Scanner;

import org.junit.Test;

public class testcalc {
	@Test
	public void testcal(){
		int c,a,b;
        Scanner s=new Scanner(System.in);
		System.out.println("menu:");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		System.out.println("Enter choice");
		c=s.nextInt();
		if(c<1 || c>4) {
			System.out.println("Invalid input");
		}
		else {
		System.out.println("enter first operand");
		a=s.nextInt();
		System.out.println("enter second operand");
		b=s.nextInt();
		int[] result= {
				a+b,a-b,a*b,a/b
		};
		System.out.println("Result is "+result[c-1]);
	}
	}

}
