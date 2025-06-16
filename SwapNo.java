package basics;

import java.util.Scanner;

public class SwapNo {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Value of a = ");
		int a = sc.nextInt();
		System.out.println("Enter value of b = ");
		int b= sc.nextInt();
		
		a=a+b;	//a=10+20=30
		b=a-b;	//b=30-20=10
		a=a-b;	//a=30-10=20
		System.out.println("After swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		sc.close();

	}

}
