package PavanSir;

import java.util.Scanner;

public class AdvPatternTriangleNumSeries1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }

            int y=1;
            for (int j = 1; j <=i ; j++) { //for increasing value of y
                System.out.print(y);
                y++;
            }

            y=i-1;
            for (int j = 2; j <=i ; j++) { //for dec value of y
                System.out.print(y);
                y--;
            }
            System.out.println();
        }
    }
}
