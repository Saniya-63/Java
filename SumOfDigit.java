package basics;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		sc.close();
		
	while(num>0) {
		int rem=0,res=0;
		while(num>0) {
			rem = num%10;
			res = res+rem;
			num = num/10;
		}
		System.out.println("The sum of the digit is = "+res);
	}
	}

}
