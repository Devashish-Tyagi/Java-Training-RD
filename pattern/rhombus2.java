package pattern;

import java.util.Scanner;

public class rhombus2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n =sc.nextInt();
        System.out.println();

        for (int i = n; i>0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


        sc.close();
    }
    
}
