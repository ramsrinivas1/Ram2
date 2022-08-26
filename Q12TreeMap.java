import java.util.TreeMap;

public class Q12TreeMap {
	
public static void main(String[] agrs) {
		
		// create  a tree map
		TreeMap <Integer,String> tree_map1 = new TreeMap <Integer,String> ();
		

		// Put elements to the map
		tree_map1.put(10,"Sai");
		tree_map1.put(20,"Hari");
		tree_map1.put(40,"Ram");
		tree_map1.put(50,"Sam");
		tree_map1.put(60,"Krishna");
		
		System.out.println("Original TreeMap content: "+ tree_map1);
		 System.out.println("Checking the entry for 10: ");
		  System.out.println("Key is: " + tree_map1.floorEntry(10));
		  System.out.println("Checking the entry for 30: ");
		  System.out.println("Key is: " + tree_map1.floorEntry(30));
		  System.out.println("Checking the entry for 70: ");
		  System.out.println("Key is: " + tree_map1.floorEntry(70));
		 }
		}