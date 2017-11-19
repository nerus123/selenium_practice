package acessmodifiers;

public class CallingDefaultDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DefaultDemo.x);
		System.out.println(DefaultDemo.sum(3));
		
		//create object for the class to call non static methods
		DefaultDemo dd=new DefaultDemo();
		System.out.println(dd.y);
		dd.sum();
		
	}

}
