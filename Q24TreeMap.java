import java.util.TreeMap;

public class Q24TreeMap {
	
	
	 public static void main(String args[]) {

		  // Declare tree maps
		  TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();

		  // Put elements to the map 
		  tree_map.put(10, "Krishna");
		  tree_map.put(20, "Teja");
		  tree_map.put(30, "Sai");
		  tree_map.put(40, "Ram");
		  tree_map.put(50, "Hari");
		  System.out.println("Orginal TreeMap content: " + tree_map);
		  System.out.println("Keys are greater than 20: " + tree_map.tailMap(20, false));
		 }
		}
