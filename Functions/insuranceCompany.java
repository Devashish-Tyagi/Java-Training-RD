package Functions;

import java.util.Scanner;

//   11. A Insurance Company have a following polices (Insurance Premium Calculation program)
// 		User Input :
//                     a. Person Name
//                     b. Person gender
//                     c. Person Age
//                     d. Person city (Metro or Non-Metro)
// 	Conditions:
// 		if person age is 25 to 35 and gender is male and city is metro , Output is Premium is 6%
// 		if person age is 25 to 40 and gender is male and city is non-metro, Output is Premium 4%
// 		if person age is 25 to 42 and gender is female and city is Metro, Output is Premium 3%
// 		if person age is 25 to 45 and gender is female and city is non-metro , output is Premium 2%
// 		else
//  		Not Insured

public class insuranceCompany {

    public static void insurance(int age  , int gender , int city){

        if((age>25 && age <35)&&(gender==1)&&(city==1)){
            System.out.println("Premium is 6% ");
        }
       else if((age>25 && age <40)&&(gender==1)&&(city==2)){
            System.out.println("Premium is 4% ");
        }
      else if((age>25 && age <42)&&(gender==2)&&(city==1)){
            System.out.println("Premium is 3% ");
        }
      else if((age>25 && age <45)&&(gender==2)&&(city==2)){
            System.out.println("Premium is 2% ");
        }
        else 
        System.out.println("Not Insured ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name ");
        String name = sc.nextLine();
        System.out.println("Enter Gender :  Press 1 for male and 2 for female ");
        int gender = sc.nextInt();
        System.out.println("Enter age :  ");
        int age = sc.nextInt();
        System.out.println("Enter city : Press 1 for Metro and 2 for non metro city ");
        int city = sc.nextInt() ;

        System.out.println("Name of person is : "+ name );
        insurance(age, gender, city);
        sc.close();

    }

}
