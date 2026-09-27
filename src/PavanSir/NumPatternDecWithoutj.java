package PavanSir;

import java.util.Scanner;

public class NumPatternDecWithoutj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            int y = 5;
            for (int j = 1; j <=i ; j++) {
                System.out.print(y);
                y--;
            }
            System.out.println();
        }
    }
}
