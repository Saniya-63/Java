package basics;

import java.util.Scanner;

public class PrintOdds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Odd Numbers from 1 to "+num);
		findOddno(num);
		System.out.println("Even Numbers from 1 to "+num);
		findEvenno(num);
		sc.close();
	}
	
	static void findOddno(int n) {
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
				count = count +1;
			}
		}System.out.println("Count of Odd numbers = "+count);
	}
	static void findEvenno(int n) {
		int count =0;
		for(int i =1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
				count = count+1;
			}
		}System.out.println("Count of Even numbers = "+count);
	}

}
