package controlstrucrure;

public class ConditionDemo {
	
	
	//non static method
	private void ifDemo(int a,int b){
		
		if(a>b){
			System.out.println("executing the ifDemo().........");
			System.out.println("a is greaterthan b:"+a);
		}
		System.out.println("verify a<b condition wit ifDemo().....");
		if(a<b){
			System.out.println("a is less than b:"+b);
		}
		
		if(a==b){
			System.out.println("verify the a and b are equal");
			System.out.println("both are equal");
		}
	}
 static void ifElseDemo(int a,int b){
	if(a>b){
		System.out.println("a is bigger than b:"+a);
	}else{
		System.out.println("b is bigger:"+b);
	}
 }
 
 protected void findBiggerNumber(int i, int j ,int k){
	System.out.println("executing the 3 numbers:");
	System.out.println("i value is:"+i+"j value is:"+j+" k valu eis:"+k);
	if(i>j&&i>k){
		System.out.println("i is big");
	}else if(j>i&&j>k){
		System.out.println("jis big");
	}else{
		System.out.println("k is big");
	}
 }
 
 public static void enteredCharacterIsVowlOrNot(char c){
	 switch(c){
	 case'a':
	 System.out.println("entered charcacter is vowel");
	 break;
	 case'e':
		 System.out.println("entered charcacter is vowel");
		 break;
	 case'i':
		 System.out.println("entered charcacter is vowel");
		 break;
	 case'0':
		 System.out.println("entered charcacter is vowel");
		 break;
	 case'u':
		 System.out.println("entered charcacter is vowel");
		 break;
		 default:
			 System.out.println("enetered chracter is not vowel");
		 
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConditionDemo cd=new ConditionDemo();
		cd.ifDemo(3, 3);
		
    cd.ifElseDemo(3, 5);
    
    cd.findBiggerNumber(3, 5, 8);
    enteredCharacterIsVowlOrNot('b');
	}

}
