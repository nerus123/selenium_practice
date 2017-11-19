package arraydemo;

import acessmodifiers.ProtectedDemo;

public class CallingProtectedDemoOtherPackage extends ProtectedDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ProtectedDemo.fname);
		ProtectedDemo.printArray();
		CallingProtectedDemoOtherPackage c=new CallingProtectedDemoOtherPackage();
		System.out.println(c.x);
		String s1=c.getValue("neelima");
		System.out.println(s1);
		
		
	}

}
