package methods;

public class NonStaticMehods {
	//declare nonstatic varaible
	//accessmodifier datatype variablename="value;
	String s="ruby";
	protected float f=5.25F;
	
	//declare static variables
	//accessmodifier static datatype variablename="value;
	private static int x=25,y=30;
	
	
	//nonstaticmethod with void without parameters
	//accessmodifier void methodname(){logic+statemnets}
	private void division(){
		System.out.println("start execute the division()........");
		
		float div=(x+y)/x;//it gives the quotient
		System.out.println("dividing the numbers by modulo:"+div);
		
		int div1=x%2;//itgives reaminder
		System.out.println("dividing with% will give remainder:"+div1);
	}
	
	
	
	//nonstaticmethod with void with parameters
	//accessmodifier void methodname(datatype p1,datatypep2,....){logic+statemnets}
	public void swap(int a,int b){
		System.out.println("before swapping a value is:"+a+"b values is:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after  swapping a value is:"+a+"b values is:"+b);
	}
	
	
	
	
	
	//nonstaticmethod without void without parameters(returntype)
	//accessmodifier datatype methodname(){logic+statemnets  return varaible;}
	
	String getLang(){
		
		return s;
	}
	
	
	
	//nonstaticmethod without void without parameters
		//accessmodifier datatype methodname(datatypep1,datatypep2,....){logic+statemnets  return varaible;}
	
	protected int average(int i,int j){
		int avg=(int) ((x+y+f+i+j)/5);
		return avg;
	}
	
	//convert the farienheit to celesius
	public void convertTemperatur(float tf){
	//convert into clesius if you give faraenheit
		float tc=(tf- 32) * 5/9 ;
		System.out.println("covert the given  temp to celesius:"+tc);
		
		float tf1=(tc* 9/5) + 32 ;
		System.out.println("covert the given  temp to farenheit:"+tf1);
		
		if(tf1==tf){
			System.out.println("both are equal");
		}else{
			System.out.println("not equal");
		}
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//how to call nonstatic methods under main method
		//create object for the class to call non sttaic methods
		//classname refvar=new classnamee();
		NonStaticMehods nsm=new NonStaticMehods();
		nsm.swap(2, 3);
		System.out.println("**************************");
		
		nsm.division();
		System.out.println("**************************");
//how to call return type non static methods under main method
		//datatypeofthemethod refvar=refofobject.nonstaticreturntypemethod
		int a=nsm.average(15, 25);
		System.out.println("average of 5  numbers is:"+a);
		System.out.println("**************************");
		
		String s1=nsm.s;
		System.out.println("calling non static variable is:"+s1);
		System.out.println("**************************");
		
		nsm.convertTemperatur(90.1F);
	}

}
