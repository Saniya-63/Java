package basics;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		int count=0;
		sc.close();
		
		while(num>0) {
			num=num/10;
			count = count+1;	
		}
		System.out.println("Count = "+count);
	}

}
