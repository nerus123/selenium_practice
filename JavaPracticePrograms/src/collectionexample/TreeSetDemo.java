package collectionexample;

import java.util.TreeSet;

public class TreeSetDemo {
	//***********************************
		/*Set:is an interface extends to collection interface
		 *set does not allow duplicate elements
		 *set is unordred collcetion
		 *set cannnot be accessed by index based
		 *HashSet LinkedHashSet,TreeSEt calss implements the set interface
		 */
	//**********************************
	/*
	/*contains unique elements
	 * maintain ascending order
	 * access and retrieval times are quiet fast
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//important points
		TreeSet t=new TreeSet();
		t.add("neeraja");
		t.add("sunitha");
		t.add("rajani");
		t.add("sunitha");
		
		System.out.println(t);
		

	}

}
