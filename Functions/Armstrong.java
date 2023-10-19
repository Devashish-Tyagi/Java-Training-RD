package Functions;

import java.util.Scanner;

public class Armstrong {

    private static int findLength(int n) {
        int length = 0;
        while (n != 0) {
            n = n / 10;
            length++;
        }
        return length;
    }

    private static int findPower(int base, int exp) {

        int powerValue = 1;
        for (int i = 1; i <= exp; i++) {
            powerValue *= base;
        }
        return powerValue;
    }


    static int isArmstrong(int num) {
        int numCopy = num;
        int numLength = findLength(numCopy);
        int sum = 0;
        while (numCopy != 0) {
            int lastDigit = numCopy % 10;
            sum += findPower(lastDigit, numLength);
            numCopy /= 10;
        }

        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();

       int sum =  isArmstrong(n);   
       if(sum ==n )
        System.out.println("This is a Armstrong number");
        else
        System.out.println("This is not a armstrong number");


        sc.close();
    }

}
