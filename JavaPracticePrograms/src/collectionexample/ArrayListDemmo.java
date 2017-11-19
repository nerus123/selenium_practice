package collectionexample;

import java.util.ArrayList;

public class ArrayListDemmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object for ArrayList class
		ArrayList al=new ArrayList();
		al.add("java");
		al.add(0, "selenium");
		al.add("ruby");
		System.out.println(al);
		System.out.println(al.contains("java"));
	

	}

}
