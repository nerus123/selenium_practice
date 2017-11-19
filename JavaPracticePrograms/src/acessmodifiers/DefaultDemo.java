package acessmodifiers;

 class DefaultDemo {
	
	//default can be applied on class ,variables,method and constructor
	//default can be acceseed inside the package in any class
	
	 static int x=10;
	 int y=25;
	 DefaultDemo(){
		 System.out.println("default constructor is executing");
	 }
	 // static   method
	static int sum(int n){
		 int sum=0;
		
		 for(int i=1;i<=n;i++){
			 sum=sum+i;
		 }
		 return sum;
	 }
	
	void sum(){
		int sum=x+y;
		System.out.println("sum of x,y is:"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1=sum(3);
		System.out.println(i1);
		System.out.println("static variable is:"+x);
		//calling non static varaibles and non static methods
		 DefaultDemo dd=new  DefaultDemo();
		 dd.sum();
		 System.out.println("non static variable is:"+dd.y);
		 
		
	}

}
