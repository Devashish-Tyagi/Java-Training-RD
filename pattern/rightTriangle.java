package pattern;

// import java.util.Scanner;

public class rightTriangle {
    public static void main(String[] args) {
        //  Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number ");
        // int n =sc.nextInt();
        int n =7 ;
        for(int i =0 ;i<n ;i++){
            for (int j =0 ;j<i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

           for(int i =n ;i>=0 ;i--){
            for (int j =0 ;j<i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

           for(int i =0 ;i<=n ;i++){
            for (int j =n ;j>=i ;j--){
                System.out.print("*");
            }
            System.out.println();
        }

        // sc.close();

    }
    
}
