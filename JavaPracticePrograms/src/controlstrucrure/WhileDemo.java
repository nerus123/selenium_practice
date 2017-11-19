package controlstrucrure;

public class WhileDemo {
	
	private static void print1To10NumbersUsingWhile(){
		int i=1;
		while(i<=10){
			System.out.print(i+"\t");
			i++;
		}
		System.out.println(" ");
		System.out.println("program executed suceesfuly....");
	}
	
	private static void print1To10numbers(int n){
		int i=1;
		while(i<=n){
			System.out.print(i+"\t");
			i++;
		}
		System.out.println("");
		System.out.println("staticmethod with parameter executed suceesfully...");
	}
	
	static void print50To1UsingWhile(){
		int i=50;
		while(i>=1){
			if(i%2==0){
				System.out.print(i+"\t ");	
			}
			
			i--;
		}
		System.out.println("\t");
		System.out.println("staticmethod executed suceesfully...");
	}
	public static void printAToZCharactersUsingWhile(){
	char c='A';
	while(c<='z'){
		System.out.print(c+" ");
		
		c++;
	}
	System.out.print("");
	System.out.println("staticmethod with  executed suceesfully...");
	}
	
	public static void printAsciiValuesForAToZ(){
		int i='A';
		while(i<='Z'){
			System.out.print(i+" ");
			i++;
		}
		System.out.println("");
		System.out.println("staticmethod with  executed suceesfully...");
		
	}
	
	public static void multiplication(int m,int n){
		//2*1=2
		//2*2=4
		//2*3=6
		//2*10=20
		//m*i=m*i;
		int i=1;
		while(i<=n){
			System.out.println(m+"x"+i+"="+m*i);
			i++;
		}
		System.out.println("***************************************************");
	}
	
	public static void sumOfNNumbers(int m){
		int sum=0;
		int i=1;
		while(i<=m){
			sum=sum+i;
			i++;
		}
		System.out.println(sum);
	}
	
	public static int sumOfNumbers(int m){
		int sum=0;
		int i=1;
		while(i<=m){
			sum=sum+i;
			i++;
		}
		return sum;
	}
	//sum of even numbers
	public static int SumOfEveNumbersUsingWhile(int n){
		int sumEven=0;
		int i=1;
				while(i<=n){
					if(i%2==0){
					sumEven=sumEven+i;
				}
					i++;
	}
return sumEven;
	}
	
	
	//sumof even numbers and oddnumbers
	public static void sumOfEvenAndOddNumbers(int n){
		int sumEven=0;
		int sumOdd=0;
		int i=1;
		while(i<=n){
		if(i%2==0){
			sumEven=sumEven+i;
		}else{
			sumOdd=sumOdd+i;
		}
		i++;
		}
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print1To10NumbersUsingWhile();
		print1To10numbers(5);
		print50To1UsingWhile();
		printAToZCharactersUsingWhile();
		printAsciiValuesForAToZ();
		multiplication(2,10);
		sumOfNNumbers(3);
		//how to call returntype staticmethods
		//datatypeofthe method varname=returntypestaticmethod
		int s=sumOfNumbers(3);
		System.out.println(s);
		
		int s1=SumOfEveNumbersUsingWhile(50);
		System.out.println(s1);
		
		sumOfEvenAndOddNumbers(50);

	}

}
