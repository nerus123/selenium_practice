package collectionexample;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		/* Map:A Map contains values on the basis of key
		 * map contains unique keys
		 * 
		 */
		//*********************************************
		//important points
		//1.contains values based on the keys
		//2.contains unique keys
		//3.maintains ascending order on keys
		//4.it cannot have null key and multiple null values
        //5.it maintaons insertion order(maintains order)
		TreeMap tm=new TreeMap();
		tm.put(34, "swathi");
		tm.put(56, "surender");
		tm.put(33, "sunitha");
		tm.put(35, "venkat");
		//tm.put(null, "rajani");
		tm.put(38, null);
		tm.put(1, null);
		System.out.println(tm);
		
	}

}
