package Loop;

import java.util.Scanner;

public class factorial {
    
    private static int fact(int n) {
        if(n==0||n==1) return 1;
        return n*fact(n-1);
    }

    public static void factoFor(int n ){
          int facto =1 ;
        for(int i =2 ; i<=n ;i++){
           facto*=i;
        }
        System.out.println("Factorial of number is "+facto);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n =sc.nextInt();
       System.out.println("Factorial of number is "+fact(n));

       factoFor(n);
        sc.close();
    }
}
