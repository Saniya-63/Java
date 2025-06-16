package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ShuffleArray {

	public static void main(String[] args) {
//		using collection
		System.out.println("shuffled using collection class");
	ArrayList<Integer> num = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			num.add(i);
		}
		System.out.println("Initial Array = "+num);
		Collections.shuffle(num);
		System.out.println("Shuffled array= "+num);
		Collections.shuffle(num);
		System.out.println("Shuffled array= "+num);
		
		//using Random class from math
		
		System.out.println("shuffled using Random class");
		int[]arr= {1,2,3,4,5,6,7,8,9};
		int n = arr.length;
		randomize(arr,n);
		
	}

	private static void randomize(int[] arr, int n) {
		Random r= new Random();
		
//		start from he last element and swap 
		for(int i=n-1;i>0;i--) {
			
//			pick a random index from 0 to i
			int j =r.nextInt(i+1);
			
//		swap arr[i] with the element at random index	
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}
	

}
