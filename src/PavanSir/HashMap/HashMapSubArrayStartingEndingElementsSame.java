package PavanSir.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapSubArrayStartingEndingElementsSame {
    public static void main(String[] args) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int[] a = {10,1,2,3,4,10,1,2,3,4,10,1,2,3,4};
        System.out.print(Arrays.toString(a));
        int i =1; // 1 based indexing
        for(int x : a){
            if(h.containsKey(x)){
                int start = h.get(x);
                int end = i;
                start--; end--;
                for (int j = start; j <=end ; j++) {
                    System.out.print(a[j]+" ");
                }
                System.out.println();
            }
            else{
                h.put(x,i);
            }
            i++;
        }
        System.out.println(h);
    }
}
