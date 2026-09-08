package PavanSir;

import java.util.Scanner;

public class PatternTriangleDec1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pattern :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i)+1; j++) {
                System.out.print("*"); //printing the star is the job of j
            }
            System.out.println();// changing the line is the job of i
        }
    }
}
