package basics;

public class Switch_MultilabelExpressions {

	public static void main(String[] args) {
		String day = " ";
		String result = switch(day) {
		case "M" , "W" ,"F" -> "MWF";
		case "T" , "TH" , "S" ->"TTS";
		default ->{
			if(day.isEmpty()) 
				yield "Please Insert Valid Record";
			else 
				yield "I think today is sunday";	
		}
	};
		System.out.println(result);	
	}
}
	
