package basics;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
	int num ;
	System.out.println("Enter number ");
	Scanner sc = new Scanner(System.in);
	num= sc.nextInt();
	if(num%2==0) {
		System.out.println(num+" is Even Number");
	}else 
		System.out.println(num+" is Odd Number");
		sc.close();
	}
	

}
