package oops;

public class Student1Constructor {
	int id;
	String name;
	int age;
	int marks;
	char grade;
	//default constructor
	//acessmodifier classname(){}
	public Student1Constructor(){
		System.out.println("default constructor");
	}
	
	private void printDetails(){
		System.out.println("student name is:"+name);
		System.out.println("student id is:"+id);
		System.out.println("student age is:"+age);
		System.out.println("student marks :"+marks);
		System.out.println("student grade is:"+grade);
	}
	//accessmodifier classname(datatype p1,datatypep2,....){}
	protected Student1Constructor(int i,String n,int a){
		System.out.println("executing parameterised constructor");
		id=i;
		name=n;
		age=a;
		
	}
	private Student1Constructor(int id,String name){
	this.id=id;
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1Constructor s1=new Student1Constructor();
		s1.printDetails();
		Student1Constructor s2=new Student1Constructor(12,"neeraja",25);
         s2.printDetails();
         Student1Constructor s3=new  Student1Constructor(13,"swathi");
	      s3.printDetails();

}
}