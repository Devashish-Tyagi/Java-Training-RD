package Functions;

import java.util.Scanner;

public class simpleInterest {

    public static void simpleinterest(float principle , float rate , float numberOfMonth){

        System.out.println("Simple Interest is : "+ (principle*rate*numberOfMonth)/100);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle value ");
        float p = sc.nextFloat();
        System.out.println("Enter Rate  ");
                float r = sc.nextFloat();

        System.out.println("Enter Number of month  ");
                float n = sc.nextFloat();

       simpleinterest(p, r, n);

       sc.close();
    }
    
}
