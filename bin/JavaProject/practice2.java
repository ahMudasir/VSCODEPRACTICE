package bin.JavaProject;

import java.util.Scanner;

public class practice2 {

    public static void naturalNumbers(int n){
        int sum =0;

        for (int i = 1; i <=n; i++) {
            sum += i;
         
        }
        System.out.println("The Sum of "+ n + " natural numbers are-->" +sum);
    }

    public static void sumOfDigits(int b){

        int sum =0;
        while (b>0) {
            int digit = b%10;
            sum += digit;
            b=b/10;
        }
        System.out.println("Sum of digits is-->" +sum );

    }
    public static void main(String[] args) {
        /*
         * Find the sum of n natural numbers
         */
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter digit for natural number");
        int n = sc.nextInt();

        System.out.println("Enter digits");
        int b = sc.nextInt();

        naturalNumbers(n);
        sumOfDigits(b);    
}
}
