package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetPractice {

    public void setCollectionMethod() {
        // By deafault no duplicates
        Set<Integer> hashList = new HashSet<>();
        hashList.add(15);
        hashList.add(7);
        hashList.add(7);
        hashList.add(29);
        hashList.add(14);
        hashList.add(14);
        System.out.println("Code: Set<Integer> hashList = new HashSet<>(); \n HashSet:  ");
        hashList.forEach(i -> System.out.println(i));

        // By deafault items are sorted and no duplicates
        Set<Integer> treeList = new TreeSet<>();
        treeList.add(15);
        treeList.add(7);
        treeList.add(7);
        treeList.add(29);
        treeList.add(14);
        treeList.add(14);
        System.out.println("Code:Set<Integer> treeList = new TreeSet<>(); \n TreeSet:  ");
        for (int i : hashList) {
            System.out.println(i);
        }
    }
}
