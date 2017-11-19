package methods;

public class CallingNonStaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//call other classnonstaticmethods intothis class
		//create object for that class
		NonStaticMehods nm=new NonStaticMehods();
		System.out.println("other class non static variable is:"+nm.s);
		System.out.println("other class non static variable is:"+nm.f);
		//other class static variables
		//calling other class nonstaticmethods
		int j=nm.average(2, 3);
		System.out.println(j);
		
		System.out.println("other class nonstaticmethod average is:"+nm.average(2, 3));
		nm.convertTemperatur(80.1F);
		nm.swap(20, 30);
		String ss=nm.getLang();
System.out.println("other class nonstatic variable calling with getlang():"+ss);
	}

}
