package Functions;

import java.util.Scanner;

public class leapYear {

    public static void leapYearOrNot(int year){

        if((year%4==0)||(year%100==0)&&(year%400==0)){
            System.out.println("Year is leap year ");
        }
        else
        System.out.println("This is not a leap year ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        leapYearOrNot(year);
        sc.close();
    }
    
}
