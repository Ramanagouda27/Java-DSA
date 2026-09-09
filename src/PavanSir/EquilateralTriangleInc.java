package PavanSir;

import java.util.Scanner;

public class EquilateralTriangleInc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n-i) ; j++) { // for printing the spaces
                System.out.print(" ");
            }
            for (int j = 1; j <=i+(i-1) ; j++) { // for printing the stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
