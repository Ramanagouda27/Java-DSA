package PavanSir.BruteForce;

import java.util.Arrays;

public class CountOfSubArrayWithTarget {
    public static void main(String[] args) {
        int count=0;
        int target = 30;
        int[] a = {10,20,30,40};
        System.out.println(Arrays.toString(a)); //prints the array
        for (int i = 0; i <=a.length-1; i++) {
            for (int j = i; j <=a.length-1 ; j++) {
                int sum=0;
                for (int k = i; k <=j ; k++) {
                    sum = sum+a[k];
                    System.out.print(a[k]+" ");
                }
                System.out.print("sum ="+ sum);
                if (sum == 30) {
                    count++;
                }
                System.out.println();
            }
        }
        System.out.println("Count of subarrays = "+count);
    }
}
