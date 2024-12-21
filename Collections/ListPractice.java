package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import Helper.SortElements;

public class ListPractice {
    SortElements _sortElements;

    public ListPractice(SortElements sortElements) {
        super();
        this._sortElements = sortElements;
    }

    public void listMethod() {

        List<Integer> list = new ArrayList<Integer>();
        list.add(15);
        list.add(7);
        list.add(29);
        list.add(14);
        list.add(1);
        Collections.sort(list, _sortElements.getComp());
        // ForEach loop
        System.out.println("Using ForEach loop:");
        list.forEach(c -> System.out.println(c));

        list.remove(2);
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

    public void showPersons() {

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Hari", 30));
        persons.add(new Person("Bassu", 34));
        persons.add(new Person("Abhijit", 32));

        Collections.sort(persons, _sortElements.getPersonComp());

        // Advance for loop
        System.out.println("Using Advance for loop:");
        for (var person : persons) {
            System.out.println(person.getName() + " : " + person.getAge());
        }

    }
}
