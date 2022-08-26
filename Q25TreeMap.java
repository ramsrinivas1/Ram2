import java.util.TreeMap;

public class Q25TreeMap {
	
	  public static void main(String args[]) {
		  // Declare tree maps
		  TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
		  // Put elements to the map 
		  tree_map.put(10, "Raju");
		  tree_map.put(20, "Sai");
		  tree_map.put(30, "Teja");
		  tree_map.put(40, "Hari");
		  tree_map.put(50, "Ram");
		  System.out.println("Orginal TreeMap content: " + tree_map);
		  System.out.println("Keys greater than or equal to 20: " + tree_map.ceilingEntry(20));
		  System.out.println("Keys greater than or equal to 40: " + tree_map.ceilingEntry(40));
		  System.out.println("Keys greater than or equal to 50: " + tree_map.ceilingEntry(50));
		 }
		}
