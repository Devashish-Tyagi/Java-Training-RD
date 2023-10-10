package Loop;

import java.util.Scanner;

public class countDigits {

    private static void countDigit(long n) {
       int digits=0;
       while(n!=0){
          n= n/10;
          digits++;
       }
       System.out.println("Number of digits are "+digits);
   }
   
    public static void countByLog(long n ){
        System.out.println("Number of digits are "+(int)Math.floor(Math.log10(n) + 1));
    } 

    public static void countByString(long n ){
        String s = Long.toString(n);
        System.out.println("Number of digits are "+s.length());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        long n = sc.nextInt();

        countByLog(n);
        countByString(n);
        countDigit(n);

        sc.close();
    }

}
