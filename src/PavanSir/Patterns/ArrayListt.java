package PavanSir.Patterns;
import java.util.*;
public class ArrayListt {
    public static void main (String[] args){

        // knowing about arraylist
        ArrayList<Integer> a =new ArrayList<>();
        System.out.println(a);

        //adding elements to the arraylist
        a.add(12);
        a.add(10);
        a.add(30);
        a.add(25);
        System.out.println(a);

        // print max element
        int max = Collections.max(a);
        System.out.println(max);

        //print min element
        int min = Collections.min(a);
        System.out.println(min);

        //search element
        Integer search = Collections.min(a);
        System.out.println(search);

        //sorting
        Collections.sort(a);
        System.out.println(a);

        //Sorting revers order
        Collections.sort(a, Collections.reverseOrder());
        System.out.println(a);

        // accessing the elements of list using the loop
        for(Integer i: a){
            System.out.print(i + " ");
        }

        // using index number
        for (int i = 0; i <=a.size()-1 ; i++) {
            System.out.println(a.get(i));
        }
    }
}
