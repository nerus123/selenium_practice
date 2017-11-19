package methods;

public class CallingStaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("calling static vraible fromother class is:"+StaticMethodDemo.z);
		System.out.println("AVERAGE OF FOOU NUMBERS IS:"+StaticMethodDemo.findAverage(10, 20, 30, 40));
		System.out.println("BOOLEAN VALUE IS:"+StaticMethodDemo.isTrue());
		System.out.println("sub is:"+StaticMethodDemo.subtraction());
		StaticMethodDemo.swap(2, 3);
		

	}

}
