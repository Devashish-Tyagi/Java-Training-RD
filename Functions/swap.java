package Functions;

import java.util.Scanner;

public class swap {

    public static void swapping1(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }

    public static void swapping2(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a ");
        int a = sc.nextInt();
        System.out.println("Enter value of b ");
        int b = sc.nextInt();

        System.out.println("By swapping1 function");
        swapping1(a, b);
        System.out.println("By swapping2 function");
        swapping2(a, b);

        sc.close();

    }

}
