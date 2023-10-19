package Functions;

import java.util.Scanner;

// QUESTION

// Create a Java program that takes employee details (name, basic salary)
//  and calculates the gross salary by adding HRA (30% of basic), DA (20% of basic),
//   and TA (fixed at 2000). Deduct income tax based on a tax rate. Generate salary slips 
//   displaying employee information, gross salary, income tax, and net salary.

// Gross = basic+hra+da+ta
// Net = gross - tax.
public class employee {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter name ");
    String name = sc.nextLine();
    System.out.println("Enter basic salary ");
    double basic_salary = sc.nextDouble();

    double hra = 0.30 * basic_salary;
    double da = 0.20 * basic_salary;
    int ta = 2000;

    double grossSalary = basic_salary + hra + da + ta;

    System.out.println("Name of employee : " + name);
    System.out.println("Gross Salary  : " + grossSalary);

    if (grossSalary <= 600000) {
      double tax = 0.05 * grossSalary;
      double net_salary = grossSalary - tax;
      System.out.println("Income tax : " + tax);
      System.out.println("Net salary : " + net_salary);
    }
    if (grossSalary > 600000 && grossSalary<=900000) {
      double tax = 0.10 * grossSalary;
      double net_salary = grossSalary - tax;
      System.out.println("Income tax : " + tax);
      System.out.println("Net salary : " + net_salary);
    }
    if (grossSalary > 900000 && grossSalary<=1200000) {
      double tax = 0.15 * grossSalary;
      double net_salary = grossSalary - tax;
      System.out.println("Income tax : " + tax);
      System.out.println("Net salary : " + net_salary);
    }
    if (grossSalary > 1200000 && grossSalary<=1500000) {
      double tax = 0.20 * grossSalary;
      double net_salary = grossSalary - tax;
      System.out.println("Income tax : " + tax);
      System.out.println("Net salary : " + net_salary);
    }
    if (grossSalary>1500000) {
      double tax = 0.30 * grossSalary;
      double net_salary = grossSalary - tax;
      System.out.println("Income tax : " + tax);
      System.out.println("Net salary : " + net_salary);
    }

    sc.close();
  }

}
