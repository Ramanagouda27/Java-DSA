package PavanSir.HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubArray {
    public static void main(String[] args) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int a[] ={10,-1,-2,10,11,-1,7,8,11,8,6,10,-1,-11};
        System.out.print(Arrays.toString(a));
        System.out.println();
        int i =1;
        int maxlen = 0; // to calculate the maximum length of the longest subarray
        int mark1 = 0; // for the left index
        int mark2 = 0; // for the right index
        for(int x : a){
            if(h.containsKey(x) && (i-h.get(x))>maxlen){
                maxlen = i-h.get(x);
                mark1 = h.get(x); // h.get(x) stored the previous value of x
                mark2 = i;
            }
            else{
                h.put(x,i);
            }
            i++;
        }
        mark1--; mark2--; // to change the array index from 1 to 0
        for (int j = mark1; j <=mark2 ; j++) {
            System.out.print(a[j]+" "); // prints the longest subarray
        }
        System.out.println();
        System.out.println("Length="+(maxlen+1));
    }
}
