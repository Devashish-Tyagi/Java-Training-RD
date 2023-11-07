package Functions;

import java.util.Scanner;

public class rotateNsteps {

    public static int countByLog(int n ){
        return (int)Math.floor(Math.log10(n) + 1) ;
    } 

    static void rotateNumberByk(int num, int k){ 
        int n = countByLog(num); 
        if(k<0){
            k= k+n ;
        }
        else 
        k = (k % n); 
        int left_no = num / (int)(Math.pow(10, n - k)); 
        num = num % (int)(Math.pow(10, n - k)); 
        int left_digit = countByLog(left_no); 
        num = (num * (int)(Math.pow(10, left_digit))) + left_no; 
        System.out.println(num); 
    } 
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        
        System.out.println("Rotate times : ");
        int k = sc.nextInt();
        rotateNumberByk(num, k);

        sc.close();

        
    }
    
}
