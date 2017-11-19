package collectionexample;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	//*********************************
	/*List:1:it is the subinterface.extends to Collection interface.
    2:accepts duplicate values
    3:ordered collection
    4:accessed using index based
    5:ArrayList,LinkedList,Vector classes implements the List interface*/
	//************************************************888

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		v.add("java");
		v.addElement("neeraja");
		v.add(0, "surender");
	v.add("neeraja");
		
		System.out.println(v);
		System.out.println("for each loop");
		for(Object o:v){
			System.out.println(o);
		}
		System.out.println("normal for loop");
		for(int i=0;i<=v.size()-1;i++){
			System.out.println(v.get(i));
			
		}
		System.out.println("Iterator interface");
		Iterator it=v.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		

	}

}
