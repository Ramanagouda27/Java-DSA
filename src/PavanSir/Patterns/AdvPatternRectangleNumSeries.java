package PavanSir.Patterns;

import java.util.Scanner;

public class AdvPatternRectangleNumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            int y=1;
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(y);
                y++;
            }
            y=i;
            for (int j = 1; j <=(n-i)+(n-i)+1 ; j++) {
                System.out.print(y);
            }
            y=i-1;
            for (int j = 1; j <=i-1 ; j++) {
                System.out.print(y);
                y--;
            }
            System.out.println();
        }
        n=4;
        for (int i = 1; i <=n ; i++) {
            int y=1;
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(y);
                y++;
            }

            y=(n-i)+1;
            for (int j = 1; j <=(i+i)+1 ; j++) {
                System.out.print(y);
            }
            y=n-i;
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(y);
                y--;
            }
            System.out.println();
        }
    }
}
