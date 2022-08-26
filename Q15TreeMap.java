import java.util.TreeMap;

public class Q15TreeMap {
	
	public static void main(String[] agrs) {
	
	  // Create a tree map
	   TreeMap< Integer, String > tree_map1 = new TreeMap< Integer, String >();      
	  
	  // Put elements to the map 
	  tree_map1.put(10, "Ram");
	  tree_map1.put(20, "Hari");
	  tree_map1.put(40, "Sai");
	  tree_map1.put(50, "Krishna"); 
	  tree_map1.put(60, "Sam"); 
	    
	      System.out.println("Orginal TreeMap content: "+tree_map1);
		  System.out.println("Checking the entry for 10: ");
	      System.out.println("Key(s): "+tree_map1.higherEntry(10));  
		  System.out.println("Checking the entry for 20: ");
	      System.out.println("Key(s): "+tree_map1.higherEntry(20));  
		  System.out.println("Checking the entry for 70: ");
	      System.out.println("Key(s): "+tree_map1.higherEntry(70));  
	    }
}