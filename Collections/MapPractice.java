package Collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapPractice {
    public void mapMethod() {
        Map<String, Integer> persons = new HashMap<>();
        persons.put("Mallikarjun", 82);
        persons.put("Hari", 65);
        persons.put("Bassu", 44);
        persons.put("Hari", 65);

        for (var key : persons.keySet()) {
            System.out.println(key + " : " + persons.get(key));
        }

        Map<String, Integer> people = new Hashtable<>();
        people.put("Mallikarjun", 82);
        people.put("Hari", 65);
        people.put("Bassu", 44);
        people.put("Hari", 65);

        for (var key : people.keySet()) {
            System.out.println(key + " : " + people.get(key));
        }

    }
}
