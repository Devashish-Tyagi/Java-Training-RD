package Functions;

import java.util.Scanner;

public class sumOfNnum {
    private static int sumOfnum(int n) {
        return n*(n+1)/2 ;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();


       int sum = sumOfnum( n);
       System.out.println(sum);
        sc.close();
        
    }

    
}
