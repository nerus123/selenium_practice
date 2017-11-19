package methods;

public class StaticMethodDemo {
	//declare static variables
	//accesmodifier static datatype variablename=value;
	private static int x=10,y=20;
	public static int z=25;
	
	//static method with void
	//accessmodifier static void methodname(){logic+state,emts}
	private static void sum(){
		int res=x+y+z;
		System.out.println("sum of x,y,z is:"+res);
	}
	
	//staticmethod withvoid with parameters
	//accessmodifier static void methodname(datattype p1,datatypep2,....){logic+state,emts}
	protected static void swap(int a,int b){
		System.out.println("before swaping  a value is:"+a+"b value is:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping  a value is:"+a+"b value is:"+b);
	}
	
	//static returntype method without parameters//without void without parameters
	/*accessmodifier static datatype methodname(){logic+statements
	return variable;*/
	
	public static int subtraction(){
		int sub=x+y-z;
		return sub;
	}
	
	//withoutvoid with parameters
	static int findAverage(int i,int j,int k,int l){
		int avg=(i+j+k+l)/4;
		return avg;
	}
	
	public static boolean isTrue(){
		boolean b=x>y;
		return b;
	}
	
	private static String getNmae(String fname,String lname){
		
		 String name=fname+lname;
		 return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how to call static mathod under main method
		//directly call with static method name
		sum();
		swap(2,3);
		
		//how to call returntype staticmethod under main method
		//datatypeoerhemethod refvar=returntypestaticmethodname
		int i=subtraction();
		System.out.println(i);
		
		int i1=findAverage(10,20,30,40);
		System.out.println(i1);
		
		boolean b1=isTrue();
		System.out.println(b1);
		
		String s1=getNmae("neeraja","goli");
		System.out.println("full name is:"+s1);
		System.out.println("static variable x is:"+x);

	}

}
