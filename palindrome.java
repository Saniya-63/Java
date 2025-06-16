package basics;

import java.util.Scanner;

public class palindrome 
{

		static int isPalindrome(int n)
			{
			    int rev =0;
			    while(n>0) {
			    	int rem = n%10;
			    	rev = rev *10 +rem;
			    	n = n/10;
			    }
			    return rev;
			}
		
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number= ");
			int n = sc.nextInt();
			int num =isPalindrome(n);
			
			if(n==num) 
			{
				System.out.println(n+ " is a palindrome");
			}
			else 
			{
				System.out.println(n+" is not  palindrome");
			}
			sc.close();
			}
}
