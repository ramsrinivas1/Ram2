import java.util.TreeMap;

public class Q20TreeMap {
	
	   public static void main(String args[]) {

		   // Create a tree map
		   TreeMap < Integer, String > tree_map = new TreeMap < Integer, String > ();

		   // Put elements to the map 
		   tree_map.put(10, "Sam");
		   tree_map.put(20, "Teja");
		   tree_map.put(40, "Sai");
		   tree_map.put(50, "Ram");
		   tree_map.put(60, "Hari");

		   // polling first entry
		   System.out.println("Value before poll: " + tree_map);
		   System.out.println("Value returned: " + tree_map.pollLastEntry());
		   System.out.println("Value after poll: " + tree_map);
		  }
		 }
