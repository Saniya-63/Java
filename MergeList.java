package basics;

import java.util.ArrayList;
import java.util.List;

public class MergeList {

	public static void main(String[] args) {
		ArrayList<String>list1 = new ArrayList<>();
		ArrayList<String>list2 = new ArrayList<>();
		list1.add("Saniya");
		list2.add("Shinde");
		List<String> mergedList = new ArrayList<>(list1);
		mergedList.addAll(list2);
		System.out.println(mergedList);

	}

}
