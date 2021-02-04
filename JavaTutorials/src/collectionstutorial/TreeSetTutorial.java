package collectionstutorial;

import java.util.*; // Collections contains TreeSet

public class TreeSetTutorial {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<String>(); // TreeSet Declaration

        treeSet.add("Apple");
        treeSet.add("Orange"); // adding elements to TreeSet
        treeSet.add("Fig");

        Iterator<String> itr = treeSet.iterator(); // Iterator

        while(itr.hasNext()){
            System.out.println(itr.next()); // Iterating over TreeSet
        }
    }
}
