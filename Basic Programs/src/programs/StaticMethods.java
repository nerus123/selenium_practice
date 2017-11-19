package programs;

public class StaticMethods {

	public static int x=2,y=4;
	public static char c='A';
	public short s=5;
	public static void sum(){
		System.out.println("1 ststic method with void withou parameters:");
		int z=6;
		int res=x+y+z;
		System.out.println("sum of x,y,z:"+res);
	}
	public static void add(int x,int y){
		System.out.println("2 ststic method with void with parameters:");
		int res1=x+y;
		System.out.println("add of x,y is:"+res1);
		
	}
	public static int subtraction(){
		System.out.println("3 return type static method without parameters:");
		int sub=y-x;
		return sub;
	}
	//returntype static method with parameters
	public static int multiplication(int x,int y){
		System.out.println("4 return type static method with parameters:");
		int mul=x*y;
		return mul;
	}
	//non static methods
	public void average(){
		System.out.println("5  nonstatic method with void without parameters:");
		int avg=(x+y)/2;
		System.out.println("average of x,y is:"+avg);
	}
	public void result(int x,int y){
		System.out.println("6 nonstatic method with void with parameters:");
		int r=x+y;
		System.out.println(r);
		
	}
	public int division(){
		System.out.println("7 returntype nonstatic method without parameters:");
		int d=x/2;
		return d;
	}
	public  int addition(int x,int y){
		System.out.println("8 return type nonstatic method with void with parameters:");
		int a=x+y;
		return a;
	}
	public static void main(String[] args) {
		sum();
		add(2,3);
		//how to call static returntype method under main method
		//datatype of the method ref=returntypestaticmethod
		int i=subtraction();
		System.out.println("subtrcation value is:"+i);
	
	int j=multiplication(2,3);
	System.out.println("multiplication value:"+j);
//how to call non static method under main method
//we have to create object to call nonsaticmethods
	//classname refvar=new classname();
	StaticMethods sm=new StaticMethods();
	sm.average();
	sm.result(2, 5);
	int di=sm.division();
	System.out.println(di);
	
	int it=sm.addition(2, 3);
	System.out.println(it);
	
	
		
		

	}

}
