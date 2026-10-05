package PavanSir.HashMap;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapVariation2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int[] a = {10,20,30,40,50,60};
        int i =1; // as we are suing the 1 based array index
        int sum =0;
        h.put(0,0); // by default 0th index sum is zero ; and it is subarray concept
        for(int x : a){
            sum = sum+x; // x gets element of array a[] one by one
            h.put(i,sum); // sum can be duplicated so we are writing sum after the index number ; and sum is given by sum only
                          // but index cannot be duplicated ; and index number is given by i
            i++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(h);
    }
}
