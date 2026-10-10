package PavanSir.HashMap;

import java.util.HashMap;

public class PrefixSum_SubArrayKSum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> h = new HashMap<>();
        int[] a = {10,20,30,40,10,20,30,10};
        int k = 100;
        int i=0;
        int sum = 0;
        h.put(0,0);
        for(int x : a){
            sum = sum+x;
            if(h.containsValue(sum-k)){
                System.out.println("True");
                break;
            }
            else{
                h.put(i,sum);
                i++;
            }
        }
        System.out.println("False");
    }
}
