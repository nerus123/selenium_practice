package acessmodifiers;

public class ProtectedDemo {
	
	//static variables
	protected static String fname="neeraja";
	//nonstatic variables
	protected int x=10;
	//constructor
	protected ProtectedDemo(){
		System.out.println("protected default constructor");
	}
	
	protected String getValue(String lname){
		String name=fname+lname;
		return name;
	}
	
	protected static void printArray(){
		//datatype[] arrayname=new dataype[size];
		String[] cars=new String[3];
		cars[0]="hondacity";
		cars[1]="bmw";
		cars[2]="odessy";
		for(String c:cars){
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray();
		System.out.println(fname);
		ProtectedDemo pd=new ProtectedDemo();
		System.out.println(pd.x);
		String s1=pd.getValue("goli");
		System.out.println(s1);

	}

}
