package PavanSir;
import java.util.Scanner;
public class RecomPatternInc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n-i) ; j++) { // for printing the spaces
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) { // for printing the stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
