package basics;

public class SecondLargestNumber {

	public static void main(String[] args)
{
	int[] arr= {10,54,32,2,45,60,60,60};

	int result =findSecondHighest(arr);
	System.out.println("Second highest = "+result);
	
	}
	public static int findSecondHighest(int[] arr) {
		int h = Integer.MIN_VALUE;
	int secondh =Integer.MIN_VALUE;
		
	
		for(int i : arr) {
			if(i>h) {
				secondh = h ;
				h=i;
			}else if(i>secondh) {
				secondh = i;
			}
		} return secondh;
		
	}	
}
