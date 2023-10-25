package Functions;

import java.util.Scanner;

public class toggleCase {

   

    public static void toggle1(String str) {
        String s = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(str.charAt(i))) {
              c =  Character.toLowerCase(c);
                s += c;
            }
            //  else if(Character.isUpperCase(str.charAt(i)))
            else{
               c= Character.toUpperCase(c);
                s += c;
            }
        }
        System.out.println("Case Toggled String is : " +s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

        toggle1(str);
        sc.close();
    }

}
