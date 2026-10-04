package PavanSir.Patterns;

import java.util.Scanner;

public class BoundaryPatternSquare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        int num =1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if(i==1 || i==9 || j==1 || j==9){
                    System.out.print("* "); // just added one extra space to make it to look like square
                }
                else
                    System.out.print("  "); //just added one extra space to make it to look like square
            }
            System.out.println();
        }
    }
}
