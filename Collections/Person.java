package Collections;

import java.util.Comparator;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", toString()=" + super.toString() + "]";
    }

    public Comparator<Person> getPersonComp(Person that) {
        return (p1, p2) -> this.age > that.age ? 1 : -1;
    }

}
