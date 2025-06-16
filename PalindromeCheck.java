package basics;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string You want to  check = ");
		String s = sc.next();
		
		String s1 = s;
		
		if(s1.equals(isPalindrome(s))) {
			System.out.println(s1 +" is palindrome string");
		}else {
			System.out.println(s1+" is not palindrome");
		}	
		sc.close();
	}

	
	public static String isPalindrome(String s) {
		
		String rev="";
		char ch;
		for(int i=0;i<s.length();i++) {
			ch = s.charAt(i);
			rev = ch + rev;
		}
		return rev;
		
	}
}
