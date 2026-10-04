package PavanSir.Patterns;

import java.util.Scanner;

public class ContinuousNumPatternDecSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int y=15;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(y+" ");
                y--;
            }
            System.out.println();
        }
    }
}
