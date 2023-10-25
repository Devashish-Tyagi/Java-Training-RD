package Functions;

import java.util.Scanner;

public class areaParameterRectangle {

    public static void areaPara( float b , float h){

        float parameter = b+h ;
        System.out.println("Area of rectangle is "+ b*h);
        System.out.println("parameter of rectangle is "+ parameter);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter width of rectangle ");
        float a = sc.nextFloat();
        System.out.println("Enter height of rectangle ");
        float b = sc.nextFloat();

        areaPara(a, b);
        
        sc.close();

    }

}
