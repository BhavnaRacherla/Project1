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
		System.out.println("enter first operator");
		a=s.nextInt();
		System.out.println("enter second operator");
		b=s.nextInt();
		int[] result= {
				a+b,a-b,a*b,a/b
		};
		System.out.println("Result is "+result[c-1]);
	}

}
