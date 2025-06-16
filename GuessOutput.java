package basics;

import java.util.HashSet;

public class GuessOutput {

	public static void main(String[] args) {
//		example1
		String s1 = "abc";
		String s2 = "abc";

		System.out.println("s1 == s2 is:" + s1 == s2);//false
		
//		example2
		String s3 = "JournalDev";
		int start = 1;
		char end = 5;

		System.out.println(s3.substring(start, end));//ourn
		
//example 3
		HashSet shortSet = new HashSet();

		for (short i = 0; i < 100; i++) {
	    shortSet.add(i);
	    shortSet.remove(i - 1);
	}

	System.out.println(shortSet.size());//100
	
	
//	example 4
//	try {
//		if (flag) {
//	  		while (true) {
//	   		}
//	   	} else {
//	   		System.exit(1);
//	   	}
//	}
//	catch(Exception e){
//		System.out.println(e);
//	}
//		finally {
//	}
//	   	System.out.println("In Finally"); //gets an error
//	}
	
	
//	example 5
//	String str = null;
//	String str1="abc";

	//System.out.println(str1.equals("abc") | str.equals(null));//nullpointer exception

	
//	example 6
//	String x = "abc";
//	String y = "abc";
//
//	x.concat(y);
//
//	System.out.print(x); //abc
	}

}
