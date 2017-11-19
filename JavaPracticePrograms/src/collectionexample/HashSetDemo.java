package collectionexample;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		//***********************************
				/*Set:is an interface extends to collection interface
				 *set does not allow duplicate elements
				 *set is unordred collcetion
				 *set cannnot be accessed by index based
				 *HashSet LinkedHashSet,TreeSEt calss implements the set interface
				 */
				//***********************************************
				/*important points on HashSet
				 * HashSet stores the elements by using mechanism called hashing
				 * contains unique elements only
				 */
				HashSet<String> h=new HashSet<String>();
				h.add("neeraja");
				h.add("swathi");
				h.add("neeraja");
				System.out.println(h);
				System.out.println(h.size());
				System.out.println();
			

	}

}
