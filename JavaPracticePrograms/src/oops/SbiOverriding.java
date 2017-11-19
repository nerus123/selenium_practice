package oops;

public class SbiOverriding extends BankOverriding {
	public int getRateOfInterest(){
		return 8;
	}
	public static void main(String[]args){
		//upcasting
		BankOverriding b=new SbiOverriding();
		int i=b.getRateOfInterest();
		System.out.println(i);
	}

}
