package collectionexample;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// **************************************************************
		/*List:1:it is the subinterface.extends to Collection interface.
        2:accepts duplicate values
        3:ordered collection
        4:accessed using index based
        5:ArrayList,LinkedList,Vector classes implements the List interface*/
		//*******************************************************88
		//important points onLinkedlist class
		//java linkeeList class uses doubly liknedlists to store the eleemnts
		//it inherits the abstract class and implements th elist and deque interfaces
		//*************************************************88
		/*1:contains duplicate elements
		 2:maintains insertion order
		 3:it is non synchronised
		 4:manipulation is fast because no shifting needs to be occured
		 5:can be used as list stack or queue
		 */
		//******************************************************8
		
		//cretae an object for LinkedList class
		LinkedList l=new LinkedList();
		l.add("java");
		l.addFirst("selenium");
		l.addLast("ruby");
		l.add(1, "php");
		System.out.println(l);
		/*l.clear();
		System.out.println(l);*/
		System.out.println(l.clone());
		System.out.println(l.contains("test"));
		System.out.println(l.get(0));
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.set(1, "neeraja"));
		System.out.println(l);
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);
		System.out.println(l.toArray());
		System.out.println("iterate the collection by for each loop");
		for(Object o:l){
			System.out.println(o);
		}
		System.out.println("normal for loop");
		for(int i=0;i<=l.size()-1;i++){
			System.out.println(l.get(i));
		}
System.out.println("by Iterator interface");
Iterator it=l.iterator();
while(it.hasNext()){
	System.out.println(it.next());
	
}

	}

}
