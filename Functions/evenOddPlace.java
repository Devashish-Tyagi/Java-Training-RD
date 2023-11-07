package Functions;

import java.util.Scanner;

public class evenOddPlace {

    public static int countByLog(int n ){
        return (int)Math.floor(Math.log10(n) + 1) ;
    } 

    public static void evenOdd(int n ){
        String str = Integer.toString(n);
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)%2==0){
                System.out.println("even");
            }
            else System.out.println("odd");
        }
        
       }
    
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        evenOdd(n) ;

        sc.close();
    }
    
}
