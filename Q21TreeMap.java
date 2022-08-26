import java.util.SortedMap;
import java.util.TreeMap;

public class Q21TreeMap {
	
	
	   public static void main(String args[]) {

		   // Declare tree maps
		   TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();
		   SortedMap < Integer, String > sub_tree_map = new TreeMap < Integer, String > ();

		   // Put elements to the map 
		   tree_map.put(10, "Ram");
		   tree_map.put(20, "Sai");
		   tree_map.put(30, "Hari");
		   tree_map.put(40, "Krishna");
		   tree_map.put(50, "Tom");
		   System.out.println("Orginal TreeMap content: " + tree_map);
		   sub_tree_map = tree_map.subMap(20, 40);
		   System.out.println("Sub map key-values: " + sub_tree_map);
		  }
		 }
