package Helper;

import java.util.Comparator;

import Collections.Person;

public class SortElements {

    public Comparator<Integer> getComp() {
        return (num1, num2) -> num1 > num2 ? 1 : -1;
    }

    public Comparator<Person> getPersonComp() {
        return (p1, p2) -> p1.getAge() > p2.getAge() ? 1 : -1;
    }

}
