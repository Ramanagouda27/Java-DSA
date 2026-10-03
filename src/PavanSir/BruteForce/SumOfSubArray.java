package PavanSir.BruteForce;

public class SumOfSubArray {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60,70};
        for (int i = 0; i <=a.length-1; i++) {
            for (int j = i; j <=a.length-1 ; j++) {
                int sum=0;
                for (int k = i; k <=j ; k++) {
                    sum = sum+a[k];
                    System.out.print(a[k]+" ");
                }
                System.out.print("sum ="+ sum);
                System.out.println();
            }
        }
    }
}
