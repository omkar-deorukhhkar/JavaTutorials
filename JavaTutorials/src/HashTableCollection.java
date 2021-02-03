import java.util.*; // Collections contains Array List

public class HashTableCollection {
    public static void main(String[] args) {
        Hashtable<Integer, String> hTable = new Hashtable<Integer, String>(); // declaration of Hashtable
        hTable.put(0,"Car");
        hTable.put(3, "Private Jet"); // Insertion of data in Hash Table
        hTable.put(8, "Helicopter");

        System.out.println(hTable); // Printing of Hash Table

        for(Map.Entry<Integer, String> e : hTable.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue()); // advanced for loop for Hashtable
        }

        if(hTable.containsKey(0)){
            String s = hTable.get(0); // check if Hashtable contains a key element and get it's value
            System.out.println(s);
        }

    }
}
