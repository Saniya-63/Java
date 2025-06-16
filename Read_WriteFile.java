package basics;

import java.io.*;

 class Student implements Serializable{
	int rno;
	String name;
	int marks;
	
	

	public Student(int rno, String name, int marks) {
		super();
		this.rno = rno;
		this.name = name;
		this.marks = marks;
	}



	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + ", marks=" + marks + "]";
	}

	

 }

	public class Read_WriteFile{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		FileOutputStream fos = new FileOutputStream("Stud.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(new Student(1,"john",98));
		oos.close();
		
//		Deserialization - reading object from file
		FileInputStream fis = new FileInputStream("stud.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s = (Student)ois.readObject();
		System.out.println(s);
		ois.close();
		
	}

}
