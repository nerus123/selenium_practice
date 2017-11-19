package oops;

public class StudentEncap {
	//in encapsulation declare variable as private
	private int id;
	private String name;
	private int age;
	private int marks;
	private char grade;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public char getGrade() {
		return grade;
	}



	public void setGrade(char grade) {
		this.grade = grade;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentEncap s=new StudentEncap ();
		
		s.setId(23);
		s.setName("neeraja");
		s.setAge(34);
		s.setGrade('A');
		s.setMarks(240);
		System.out.println("student id is:"+s.getId());
		System.out.println("student name is:"+s.getName());
		System.out.println("student age is:"+s.getAge());
		System.out.println("student grade is:"+s.getGrade());
		System.out.println("student marks is:"+s.getMarks());
	}
	

}
