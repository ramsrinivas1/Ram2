import java.util.TreeMap;

public class Q14TreeMap {
	
	public static void main(String[] agrs) {

	
	// Create a tree map
	  TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();

	  // Put elements to the map 
	  tree_map1.put(10, "Teja");
	  tree_map1.put(20, "Raju");
	  tree_map1.put(40, "Sai");
	  tree_map1.put(50, "Hari");
	  tree_map1.put(60,"Ram");

	  System.out.println("Orginal TreeMap content: " + tree_map1);
	  System.out.println("Checking the entry for 10: ");
	  System.out.println("Key(s): " + tree_map1.headMap(10, true));
	  System.out.println("Checking the entry for 20: ");
	  System.out.println("Key(s): " + tree_map1.headMap(20, true));
	  System.out.println("Checking the entry for 70: ");
	  System.out.println("Key(s): " + tree_map1.headMap(70, true));
	 }
	}