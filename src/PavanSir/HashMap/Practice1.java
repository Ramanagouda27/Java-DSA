package PavanSir.HashMap;

import java.util.HashMap;

public class Practice1 {
    public static void main(String[] args) {

        // creating HashMap
        HashMap h = new HashMap();

        //adding Key and values
        h.put(4,"Dhamnekar");
        h.put(1,"Ram");
        h.put(2,"Krishna");
        h.put(1,"Patil");

        System.out.println(h.get(1));
        System.out.println(h.get(2));

        System.out.println(h.get(3)); // prints null as key is not present

        //to see all the key values
        System.out.println(h.keySet());

        //to see all the values
        System.out.println(h.values());

        //to see complete Hashmap data structure
        System.out.println(h);

        //to check key is present in the hashmap
        System.out.println(h.containsKey(1));

        //to check values are present or not
        System.out.println(h.containsValue("Soni"));

        System.out.println(h.keySet());

    }
}
