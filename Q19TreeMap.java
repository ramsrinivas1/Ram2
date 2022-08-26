import java.util.TreeMap;

public class Q19TreeMap {
	
	
	 public static void main(String args[]) {

		  // Create a tree map
		  TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();

		  // Put elements to the map 
		  tree_map.put(10, "Sai");
		  tree_map.put(20, "Hari");
		  tree_map.put(40, "Ram");
		  tree_map.put(50, "Teja");
		  tree_map.put(60, "Krishna");

		  // polling first entry
		  System.out.println("Value before poll: " + tree_map);
		  System.out.println("Value returned: " + tree_map.pollFirstEntry());
		  System.out.println("Value after poll: " + tree_map);
		 }
		}
