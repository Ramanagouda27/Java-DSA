package PavanSir.BruteForce;

import java.util.Scanner;
public class AllPossiblePairsOfArray {
    public static void main(String[] args) {
        int n=5;
        int[] arr={1,2,3,4,5};
        for (int i = 0; i <=n-1 ; i++) {
            for (int j = 0; j <=n-1 ; j++) {
                System.out.println(arr[i]+" "+ arr[j] +" ");
            }
            System.out.println();
        }
    }
}
