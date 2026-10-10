package PavanSir.HashMap;

import java.util.HashMap;

public class SubArrayXOR {
    public static void main(String[] args) {
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0,1);
//      int[] a = {2,1,1,1,2,2,1,1}; // as the xor of the sub array == 0 it will print True
        int[] a = {10,101,30}; // as the xor of the subarray !=0 it will print False
        int xor = 0;
        for(int i : a){
            xor = xor^i;
            if(h.containsKey(xor)){ // if the elements is found
                System.out.println("True");
                return; // program stops here
            }
            h.put(xor,1);
        }
        System.out.println("False");
    }
}
