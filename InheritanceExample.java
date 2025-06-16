package basics;

class School{
	String name = "UES School,chiplun";
	
}
class StudentInfo extends School{
	int rno ;
	String nm; 
	public StudentInfo(int rno, String nm) {
		super();
		this.rno = rno;
		this.nm = nm;
	}
	@Override
	public String toString() {
		return "StudentInfo [rno=" + rno + ", nm=" + nm + ", name=" + name + "]";
	}
	
}


public class InheritanceExample {

	public static void main(String[] args) {
		StudentInfo std = new StudentInfo(101,"saniya");
		System.out.println(std);

	}

}
