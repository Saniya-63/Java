package basics;

import java.util.ArrayList;

public class forEach {

	public static void main(String[] args) {
		ArrayList<String> animal = new ArrayList<>();
		animal.add("cat");
		animal.add("dog");
		animal.add("horse");
		animal.add("Tiger");
		
		for(String i:animal) {
			System.out.println(i);
		}
		
		int[] arr = {1,2,3,4,5};
		for(int i :arr) {
			System.out.println(i);
		}
	}

}
