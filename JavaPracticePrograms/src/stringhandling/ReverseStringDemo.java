package stringhandling;

public class ReverseStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="selenium";
int count= s.length();
System.out.println("length of string s is:"+count);
for(int i=s.length()-1;i>=0;i--){
	System.out.print(s.charAt(i));
}
System.out.println("");
//toCharArray();
//convert string to char array
char[] ch=s.toCharArray();
//char[] ch={'s','e','l','e','n','i','u','m'};
for(int j=ch.length-1;j>=0;j--){
	System.out.print(ch[j]);
}
	}

}
