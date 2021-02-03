import java.util.*; // Collections contains Array List

public class ArrayListCollection {

    public static void main(String[] args) {

        ArrayList<String> aList = new ArrayList<String>(); // ArrayList of Strings

        aList.add("Car"); // add elements to an ArrayList
        aList.add("Aeroplane");
        aList.add("Helicopter");
        aList.add("Train");

        System.out.println(aList); // print an ArrayList

        for(int i=0; i<aList.size(); i++){
            System.out.println(aList.get(i)); // Use for loop on an ArrayList
        }

        aList.set(1, "Private Jet"); // change element at given index

        for(String str : aList){
            System.out.println(str + " "); // use for-each loop for ArrayList traversal
        }
    }
}
