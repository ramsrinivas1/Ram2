import java.util.TreeMap;

public class Q18TreeMap {
	
	  public static void main(String args[]) {

		  // Create a tree map
		  TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();

		  // Put elements to the map 
		  tree_map1.put(10, "Sai");
		  tree_map1.put(20, "Hari");
		  tree_map1.put(40, "Ram");
		  tree_map1.put(50, "Raju");
		  tree_map1.put(60, "Sam");

		  System.out.println("Orginal TreeMap content: " + tree_map1);
		  System.out.println("Orginal TreeMap content: " + tree_map1.navigableKeySet());

		 }
		}
