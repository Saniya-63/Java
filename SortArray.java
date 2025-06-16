package basics;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		int []arr= {};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array = ");
		int n= sc.nextInt();
		arr = new int[n];
		
		
		System.out.println("Enter the elements of array ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Array before sorting : "+Arrays.toString(arr));
		 Arrays.sort(arr);
		 System.out.print("Array After sorting : "+Arrays.toString(arr));
		sc.close();
	}

}
