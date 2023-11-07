package Functions;

import java.util.Scanner;

public class printDigits {

    public static void print(int n ){
        while(n!=0){
            int digit = n%10 ;
            System.out.println(digit);
            n = n/10 ;
        }
    }

     public static void prints(int n ){
        String string_number = Integer.toString(n);
        for (int i = 0; i < string_number.length(); i++) {
 
            System.out.println(string_number.charAt(i));
        }
     }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        print(n) ;
        prints(n);

        sc.close();
    }
    
}
