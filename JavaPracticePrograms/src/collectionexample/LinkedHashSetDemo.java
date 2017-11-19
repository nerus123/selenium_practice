package collectionexample;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		//***********************************
		/*Set:is an interface extends to collection interface
		 *set does not allow duplicate elements
		 *set is unordred collcetion
		 *set cannnot be accessed by index based
		 *HashSet LinkedHashSet,TreeSEt calss implements the set interface
		 */
		//****************************************
		/*LinkedHashSet  class is HahTable and LInkedList implementatio of the set interface.
		it inherits HashSet class and implements set interface
		  important points LInkedHashSet
		 * contains unique elemnts only
		 * provides all optional set operations and permits null elelmnts
		 * maintains insertion order
		 */
		
LinkedHashSet<String> lhs=new LinkedHashSet<String>();
lhs.add("neeraja");
lhs.add("neelima");
lhs.add("sunitha");
lhs.add("sunil");
lhs.add(null);
System.out.println(lhs.size());
System.out.println(lhs);
System.out.println("********************************");
//iterate the collection
for(String s:lhs){
	System.out.print(s+"\t");
}
//for loop
/*for(int i=0;i<=lhs.size()-1;i++){
	System.out.println(lhs.);
}*/
Iterator it=lhs.iterator();
while(it.hasNext()){
	System.out.println(it.next());
}

	}
	

}
