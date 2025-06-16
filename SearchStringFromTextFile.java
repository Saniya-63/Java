package basics;
import java.io.*;
import java.util.Scanner;

public class SearchStringFromTextFile {

	public static void main(String[] args) throws IOException {
		File input = new File("Student.txt");
		FileReader fr = null;
		Scanner ob = new Scanner(System.in);
		String SearchWord,str;
		System.out.println("Enter word to search :");
		SearchWord = ob.nextLine();
		
		 fr = new FileReader(input);
		 BufferedReader br = new BufferedReader(fr);
		
		 while((str=br.readLine())!=null) {
			 if(str.contains(SearchWord)) {
				 System.out.println(str);
			 }
		 }
		 fr.close();
		 ob.close();
	} 

}
