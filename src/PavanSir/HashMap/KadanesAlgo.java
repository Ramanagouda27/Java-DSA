package PavanSir.HashMap;

import java.util.Arrays;

public class KadanesAlgo {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,-500,50,60};
        System.out.println(Arrays.toString(a));
        int max =0; //max variable which stored the maximum value
        for(int i : a){
            max = Math.max(max+i,i); // checks the max value and compares
            System.out.print(max+" "); // only the maximum values are printed
        }
    }
}
