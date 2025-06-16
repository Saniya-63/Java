package basics;

import java.util.Scanner;

public class SumOfArrayElement {

	public static void main(String[] args) {
		int a[] = {};
		int sum =0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size of array = ");
		int n = sc.nextInt();
		a = new int [n];
		sc.close();
		
		System.out.println("Enter Array Elements ");
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();	
			sum = sum+a[i];
		}
		System.out.println("Sum of array is = "+sum);
	}

}
