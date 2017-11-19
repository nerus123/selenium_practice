package acessmodifiers;

public class CallingProtectedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProtectedDemo.printArray();
		System.out.println(ProtectedDemo.fname);
		ProtectedDemo pd=new ProtectedDemo();
		System.out.println(pd.x);
		String s1=pd.getValue("ramreddola");
		System.out.println(s1);
		
		

	}

}
