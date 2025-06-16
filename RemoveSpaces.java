package basics;

public class RemoveSpaces {

	public static void main(String[] args) {
		String str = " j a va s ta  r    ";
		System.out.println("Before removing spaces="+str);
		str= str.replaceAll("\\s", "");
		System.out.println("After removing spaces="+str);
	}

}
