package Functions;

import java.util.Scanner;

public class powerSum {
    // 1^1 + 2^2 + 3^3 ......   n^n 
    
    public static void powersSum(int n ){
        int sum =0 ;
        for(int i =1 ;i<n+1 ;i++){
            sum = sum +(int)(Math.pow(i, i));
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();

        powersSum( n ) ;
        sc.close();
    }
    
}
