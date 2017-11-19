package oops;

public class HdfcOverriding extends BankOverriding{
	public int getRateOfInterest(){
		return 10;
	}
	public static void main(String[]args){
		HdfcOverriding h=new HdfcOverriding();
		h.getRateOfInterest();
		System.out.println("hdfc interest is:"+h.getRateOfInterest());
		System.out.println("*****************************");
		
		int i=h.getRateOfInterest();
		System.out.println(i);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		//upcasting 
		//parentclass refvar= new cildclass();
		BankOverriding b=new HdfcOverriding();
		System.out.println(b.getRateOfInterest());
		BankOverriding b1=new SbiOverriding();
		int i1=b1.getRateOfInterest();
		System.out.println(i1);
	}

}
