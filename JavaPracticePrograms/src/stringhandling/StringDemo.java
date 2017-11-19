package stringhandling;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creating string literal
		String s = "java";
		System.out.println("string value is:" + s);

		char[] ch = { 's', 'e', 'l', 'e', 'n', 'i', 'u', 'm' };
		// create object for String class
		String s1 = new String(ch);
		System.out.println("character array converted into string:" + s1);
		// 1 length() 
		int count = s.length();
		System.out.println("number of characters in given string is:" + count);

		// 2 charAt(int index)
		char c = s.charAt(0);
		System.out.println("0 position char is:" + c);

		// 3 toCharArray()
		char[] cr = s.toCharArray();
		// print the array using for each loop
		for (char c1 : cr) {
			System.out.print(c1 + "\t");
		}
		System.out.println("");
		System.out.println("********************************");
		// print the array using for loop
		for (int i = 0; i <= cr.length - 1; i++) {
			System.out.print(cr[i] + "\t");
			
			// 4:substring() 

		}
		System.out.println("");
		String s2 = s1.substring(1);
		System.out.println("substring with startindex is:" + s2);
		String s3 = s1.substring(0, 5);
		System.out.println("substring with start index and end index is:"+s3);
		//5:split("delimeter")
		String s4="java selenium web driver and selenium rc";
		String[] words=s4.split(" ");
		//words[]={"java","seleenium","web","driver","and","selenium","rc}
		            //  0     1        2       3      4        5        6
		System.out.println(words[3]);
		
		//5:toUpperCase();
		String s5=s.toUpperCase();
		System.out.println("convert the given string into uppercase:"+s5);
		//6:toLowerCase();
		String s6=s5.toLowerCase();
		System.out.println("Converting given string into lower case:"+s6);
		
		//equals()
		System.out.println("compare s5 and s6:"+s5.equals(s6));
		
		//equalsIgnoreCase()
		System.out.println("compare s5 and s6:"+s5.equalsIgnoreCase(s6));
		
		//contains()
		System.out.println(s2.contains("xy"));
		
		//trim();
		
		
		//contact();
		System.out.println(s.concat(s1));
		String s7=s.concat(s1);
		System.out.println(s7);
		//indexOF();
		
		int c1=s7.indexOf('j');
		System.out.println(c1);
		int c2=s7.indexOf("selenium");
		System.out.println(c2);
		int c3=s7.indexOf("java");
		System.out.println(c2);
		
		//lastIndex()
		int c4=s7.lastIndexOf('e');
		System.out.println(c4); 
		
		//replace
		String s8=s7.replace("java", "ruby");
          System.out.println(s8);
          String s9=s7.replace('e', 'r');
          System.out.println(s9);
          //replaceAll()
         String s10= s7.replaceAll("e", "a");
         System.out.println(s10);
         
         //getBytes();
         byte[] bt=s7.getBytes();
         for(byte b:bt){
        	 System.out.println(b);
         }
         
         //valueOf()
         //diffrent values convert into string
         
          int i=10;
          String str=String.valueOf(10);
          System.out.println(str);
          String s11=i+str;
          System.out.println(s11);
		
	}         

}
