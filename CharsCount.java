package basics;

import java.util.HashMap;

public class CharsCount {

	public static void main(String[] args) throws java.lang.Exception {
		String s = "abcdABCDabcd";
		
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i=0;i<s.length();i++) {
			Character ch = s.charAt(i);
			if(hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);

	}

}
