package collectionexample;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHshMapDemo {

	public static void main(String[] args) {
		/* Map:A Map contains values on the basis of key
		 * map contains unique keys
		 * 
		 */
		//*******************************************************************
		//important points
				//1.contains values based on the keys
				//2.contains unique values
				//3.maintains no order
				//4.it may have one null key and multiple null values
		        //5.it maintaons insertion order(maintains order)
				LinkedHashMap hm=new LinkedHashMap();
				hm.put(23, "neeraja");
				hm.put(13, "surender");
				hm.put(34, 5);
				hm.put(78, 10);
				hm.put(28, "saritha");
				hm.put(15, "saritha");
				hm.put(null, 34);
				hm.put(38, null);
				hm.put(2, null);
				hm.put(5, null);
				System.out.println(hm);

	}

}
