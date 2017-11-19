package collectionexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		//********************************************************************
		/*List:1:it is the subinterface.extends to Collection interface.
		        2:accepts duplicate values
		        3:ordered collection
		        4:accessed using index based
		        5:ArrayList,LinkedList,Vector classes implements the List interface*/
		// ***************************************************************
		//important points
		//1.ArrayList contains duplicate elements
		//2.maintains  insertion order
		//3.it is non synchronised
		//4.it allows random access because array works at the index basis
		//5.manipulation is slow because lot of shiftings need to be occured if any element removed from array list
		//*********************************************************************************************
		
		//nongeneric
//create an object for arraylist class and map to the list interface
		List al=new ArrayList();
		System.out.println("size of the al collection is:"+al.size());
		al.add("java");
		al.add(25);
		al.add(1,true);
		al.add(3.5F);               //list interface method
		al.add('c');
		al.add("java");
		al.add(25);
		System.out.println(al);
		System.out.println("after inserting size of the al collection is:"+al.size());
		System.out.println("search for java keyword:"+al.contains("java"));
		System.out.println("search for java keyword:"+al.contains("ruby"));
		System.out.println("comparing collection elemnt with my element:"+al.get(1).equals(true));
		System.out.println("remove the element:"+al.remove(2));
		System.out.println("size of al is:"+al.size());
		
		//how can you iterate the class
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+"\t");
		}
		System.out.println(" ");
		System.out.println("iterate the collection by using for each loop");
		for(Object a:al){
			System.out.print(a+"\t");
		}
		System.out.println(" ");
		System.out.println("iterate the collection by using normal for loop");
		for(int i=0;i<=al.size()-1;i++){
			System.out.print(al.get(i)+"\t");
		}
		System.out.println(" ");
		al.clear();
		System.out.println(al);
		
	}

}
