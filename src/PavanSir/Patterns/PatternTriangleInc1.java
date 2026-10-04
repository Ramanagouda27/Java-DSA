package PavanSir.Patterns;

import java.util.Scanner;

public class PatternTriangleInc1 {
    public static void main(String[] args) {
        // i is for lines

        // j is for print

        // if stars are increasing top to bottom GEN:i

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of pattern :");
        int n = sc.nextInt() ;
        for (int i = 1 ; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) { // as j is responsible for printing the stars
                                           // so i used in j loop
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
