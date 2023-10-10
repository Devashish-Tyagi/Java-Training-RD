package Loop;

import java.util.Arrays;
import java.util.Scanner;

public class anagramString {

    public static boolean anagramOrNot(String str1, String str2) {

        if (str1.length() == str2.length()) {
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            for (int i = 0; i < charArray1.length; i++) {
                if (charArray1[i] != charArray2[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first String");
        String str1 = sc.next();
        System.out.println("Enter second String");
        String str2 = sc.next();

        boolean ans = anagramOrNot(str1, str2);
        if (ans == true)
            System.out.println("Strings are  anagram ");
        else
            System.out.println("Strings are not anagram ");
        sc.close();
    }

}
