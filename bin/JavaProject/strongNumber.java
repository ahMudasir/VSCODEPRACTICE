package bin.JavaProject;

import java.util.Scanner;

public class strongNumber {
    public static int factorial(int n){

        int fact =1;
        for (int i = 0; i <=n; i++) 
            fact *=i;
            return fact;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number");
        int n = sc.nextInt();

        int sum =0;
        int n2 =n;
        while (n>0) {
            int digit = n%10;
            sum += factorial(digit);
            n =n/10;
        }
        if (sum ==n2) {
            System.out.println("Strong");
        }else {
            System.out.println("Not Strong");
        }   
    }
    
}
