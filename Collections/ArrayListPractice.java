package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListPractice {

    public void arrayListMethod() {
        Collection<Integer> list = new ArrayList<Integer>();
        list.add(15);
        list.add(7);
        list.add(29);
        list.add(14);

        // ForEach loop
        System.out.println("Using ForEach loop:");
        list.forEach(c -> System.out.println(c));

        list.remove((int) 15);
        // Advance for loop
        System.out.println("Using Advance for loop:");
        for (int item : list) {
            System.out.println(item);
        }

        Iterator<Integer> values = list.iterator();
        System.out.println("Using Iterator and while:");
        while (values.hasNext()) {
            System.out.println(values.next());
        }
        list.clear();
    }
}
