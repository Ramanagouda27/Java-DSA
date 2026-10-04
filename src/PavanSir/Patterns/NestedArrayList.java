package PavanSir.Patterns;

import java.util.*;
public class NestedArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList> a = new ArrayList<ArrayList>();
        ArrayList temp = new ArrayList();
        temp.add(10);
        temp.add(20);
        a.add(temp);
        System.out.println(a);
    }
}
