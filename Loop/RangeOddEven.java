package Loop;

import java.util.Scanner;

public class RangeOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number");
        int st = sc.nextInt();
        System.out.println("Enter ending number");
        int end = sc.nextInt();

        System.out.println("Even numbers are ");
        for(int i=st ;i<end ;i++){
            if(i%2==0)
            System.out.println(i);
        }

        System.out.println("Odd numbers are ");
        for(int i=st ;i<end ;i++){
            if(i%2!=0)
            System.out.println(i);
        }
        sc.close();
    }

}
