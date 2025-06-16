package basics;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reverseNo = reverse(num);
		System.out.println("The reverse of "+num+" is = "+reverseNo);
		sc.close();

	}
	static int reverse(int num) {
		int rem=0;
		int res = 0;
		while(num>0) {
			rem = num%10;
			res=(res*10)+rem;
			num = num/10;	
			
		}return res;
	}

}
