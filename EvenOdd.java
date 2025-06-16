package basics;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	isevenodd(num);
	sc.close();	}
	
	public static void isevenodd(int n) {
		if(n%2==0) {
			System.out.println(n+" is Even");
		}else
			System.out.println(n+" is odd");
	}

}
