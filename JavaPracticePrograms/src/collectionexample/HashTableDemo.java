package collectionexample;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		//*********************************************8
		/* Map:A Map contains values on the basis of key
		 * map contains unique keys
		 * 
		 */
		//*******************************************
		//important points
				//1.contains values based on the keys
				//2.contains unique keys
				//3.it may not have have null key or null values
		        //4.it  is synchronised
		//***********************************************************
		Hashtable ht=new Hashtable();
		//put()
		ht.put(2, "sunitha");
		ht.put(0, "madan");
		ht.put(10, "raju");
		//get()
		System.out.println("value for key 0 is:"+ht.get(0));
		//keySet()
		System.out.println("all keys :"+ht.keySet());
		//remove()
		System.out.println("remove particular key:"+ht.remove(0));
		//clone()
		System.out.println("clone is:"+ht.clone());
		//contains()
		System.out.println("cpmaring with madan Is:"+ht.contains("madan"));
		System.out.println(ht);

	}

}
