import java.util.TreeMap;

public class Q17TreeMap {
	
    public static void main(String args[]) {

  // Create a tree map
  TreeMap < Integer, String > tree_map1 = new TreeMap < Integer, String > ();

  // Put elements to the map 
  tree_map1.put(10, "Ram");
  tree_map1.put(20, "Sai");
  tree_map1.put(40, "Hari");
  tree_map1.put(50, "Sam");
  tree_map1.put(60, "Teja");

  System.out.println("Orginal TreeMap content: " + tree_map1);
  System.out.println("Checking the entry for 10: ");
  System.out.println("Key(s): " + tree_map1.lowerKey(10));
  System.out.println("Checking the entry for 20: ");
  System.out.println("Key(s): " + tree_map1.lowerKey(20));
  System.out.println("Checking the entry for 70: ");
  System.out.println("Key(s): " + tree_map1.lowerKey(70));
 }
}
