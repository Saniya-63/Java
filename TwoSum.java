package basics;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoSum
{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target sum = ");
		int tsum =sc.nextInt();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		ArrayList<int[]> result = findPairsWithSum(arr,tsum);
		
//		for iteration
		for(int[]pairs:result) {
			System.out.println("("+pairs[0] +" "+pairs[1]+")");
		}
		sc.close();
		
	}
	
	public static ArrayList<int[]> findPairsWithSum(int[]arr,int tsum){
		ArrayList<int[]> pairs = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==tsum) {
				pairs.add(new int[] {arr[i],arr[j]});
			}
		}
	}
		return pairs;
	}
}
