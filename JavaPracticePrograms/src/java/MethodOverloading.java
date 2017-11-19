package java;

public class MethodOverloading {
	
	public static void sum(){
		int a=2;
		int b=5;
		int sum=(a+b);
		System.out.println(sum);
	}


	public static void sum(int i){
		int a=2;
		int b=5;
		int c=3;
		int sum=(a+b+c+i);
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum();

	}

}
