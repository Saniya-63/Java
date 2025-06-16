package basics;

import java.util.Scanner;

public class ArmstronNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		isArmstrong(num);
		sc.close();
	}
	static void isArmstrong(int num) {
		int og = num;
		int rem=0,res=0;
		while(num>0) {
			rem = num%10;
			res = res+(rem*rem*rem);
			num=num/10;
		}
		if(og==res) {
			System.out.println("number is armstrong");
		}else {
			System.out.println("number is not armstrong");
		}
		
	}
}
