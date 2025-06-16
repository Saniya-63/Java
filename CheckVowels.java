package basics;

import java.util.Scanner;

public class CheckVowels {

	public static void main(String[] args) {
		CheckVowels obj = new CheckVowels();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string = ");
		String str = sc.next();
		obj.vowel(str);
		sc.close();

	}
void vowel(String str) {
	int count =0;
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if((ch=='a'|| ch=='A')||(ch=='e'|| ch=='E')||(ch=='i'|| ch=='I')||(ch=='o'|| ch=='O')||(ch=='u'|| ch=='U')) {
			count++;
		}
	}
	System.out.println("Number of Vowels = "+count);
}
}
