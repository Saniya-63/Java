package basics;

public class CheckEqualArrays {

	public static void main(String[] args) {
			int a1[] = {1,2,3,4};
			int a2[]= {1,2,3,4};
			int count = 0;
			
			for(int i=0;i<a1.length;i++) {
					if(a1[i]==a2[i]) {
						count++;
				}
			}
			if(a1.length == count) {
				System.out.println("Arrays are equal");
			}else {
				System.out.println("Arrays are not equal");
			}
	}

}
