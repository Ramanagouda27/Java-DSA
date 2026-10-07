package PavanSir.Strings;

import java.util.HashMap;

public class StringsIntoHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> h = new HashMap<>();
        String a = "Ram Patil";
        for(char x :a.toCharArray()){ // as the datatype is varying we get datatype incompatible error
            String i = Character.toString(x); // to solve that we put the char in to another variable of type String

            // loading the string into HashMap
            if(h.containsKey(i)){
                int count = 0;
                count = h.get(i);
                count++;
                h.put(i,count);
            }
            else{
                h.put(i,1);
            }
        }
        System.out.println(h);
    }
}
