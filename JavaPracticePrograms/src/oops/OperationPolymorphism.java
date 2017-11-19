package oops;

public class OperationPolymorphism {

	public void sum(int a,int b){
		System.out.println("sum of a,b is:"+(a+b));
	}
	
	public void sum(int a,int b,int c){
		int s=a+b+c;
		System.out.println("sum of a,b,c is:"+s);
	}
	public void sum(float f,double d){
		double result=f+d;
		System.out.println("sum of f and d is:"+result);
	}
	
	public static void main(int a){
		int i=10;
		int res=a+i;
		System.out.println("sum of a,i is:"+res);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main(10);
		//create object for the class to call non static methods
		OperationPolymorphism o=new OperationPolymorphism();
		o.sum(4.5F, 245.67);
		o.sum(10, 15);
		o.sum(10, 15, 20);
		

	}

}
