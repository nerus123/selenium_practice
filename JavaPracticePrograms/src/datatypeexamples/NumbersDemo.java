package datatypeexamples;


public class NumbersDemo {
 //static variable
	//acessmodifiers static datatype variablename=value;
	private static byte b=10;
	protected static float f=4.5F;
	public static char c='A';
	//non static varable
	//accessmofier datatype variablename=value;
	protected short s=15;
	public int x=20;
	
	//declare non static method
			//accessmodifier  void metodname(){logic+statemnets}
			public  void addition(){
				long l=1234L;
				long sum=l+x+s+b;
				System.out.println("sum of l+x+s+b is:"+sum);
				
				//type casting
				x=(int) sum;
				System.out.println("after assigning sum value to x is:"+x);
				
				//assign b to s
				s=b;
				System.out.println("value of b is:"+s);
				
			}
			
			//static method
			//accessmofiier static void methodname(){logic+statemnts}
			protected static void floatDemo(){
				//s and x cannot us ein this method because both are non static variable
				
				int a=50;
				double d=a+b+f+c;
				System.out.println("sum of a,b,f and c is:"+d);
				
				
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling static method under main method
		//directly calling static method name
		floatDemo();
		//how to call static variable under main method
		System.out.println("static variable b is:"+b);
		
		//how to call non static method under main method
		//cretae an object for the class to call non static methods
		//classname refvar=new classname();
		//refvar.nonstaticmethod
		NumbersDemo nd=new NumbersDemo();
		nd.addition();
		
		//how to non static variables under main method
		System.out.println("non static variable s is"+nd.s);
		System.out.println("non static variable x is"+nd.x);
		
		
		

	}

}
