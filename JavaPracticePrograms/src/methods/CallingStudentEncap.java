package methods;

import oops.StudentEncap;

public class CallingStudentEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling other class methods
		//classname refvar=new classname();
		StudentEncap s1= new StudentEncap();
		s1.setId(24);
		s1.setName("neelima");
		s1.setAge(27);
		s1.setGrade('B');
		s1.setMarks(300);
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getGrade());
		System.out.println(s1.getMarks());

	}

}
