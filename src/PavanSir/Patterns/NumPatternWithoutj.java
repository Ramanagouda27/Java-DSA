package PavanSir.Patterns;

import java.util.Scanner;

public class NumPatternWithoutj {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            int y = 1;
            for (int j = 1; j <=i ; j++) {
                System.out.print(y);
                y++;
            }
            System.out.println();
        }
    }
}
