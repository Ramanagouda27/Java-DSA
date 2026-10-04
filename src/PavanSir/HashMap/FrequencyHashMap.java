package PavanSir.HashMap;

import java.util.HashMap;

public class FrequencyHashMap {
    public static void main(String[] args) {
        int[] a = {10,20,10,30,10,40,20,30,10,10,20,10,30,40};
        HashMap<Integer,Integer> h = new HashMap<>();
        for (Integer i : a) {
            System.out.println(i);

            if (h.containsKey(i)) {
                int count = h.get(i);
                count++; //if the same key comes again just we have to count one more time ; like it was present for 5 times now make it 6 times
                h.put(i,count); //we have to reupdate the value in hashmap so
            }
            // if element is coming for the first time
            else {
                h.put(i,1);
            }
        }

        //insertions order is not considerd here
        System.out.println(h);
    }
}
