package basics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string = ");
		String s = sc.next();
		String Result = RevString(s);
		System.out.println("Reverse string = "+Result);
		sc.close();
}

	public static  String RevString(String s) {
		String r ="";
		char ch;
		for(int i=0;i<s.length();i++) {
			ch = s.charAt(i);
			r =   ch + r;
		}
		return r;
	}

}
