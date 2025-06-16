package basics;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		PrimeNo obj = new PrimeNo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number = ");
		int n = sc.nextInt();
		obj.isPrime(n);
		sc.close();

	}
 void isPrime(int n) {
	 int count =0;
	for(int i=1;i<=n;i++) {
		if(n%i ==0) {
			count++;
		}
	}
	if(count==2) {
			System.out.println(n+" is prime number");
		}else {
			System.out.println(n+" is not prime number");
		}
	}

 }

