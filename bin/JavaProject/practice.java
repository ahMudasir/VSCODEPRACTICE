package bin.JavaProject;

import java.util.Scanner;

public class practice {

   static void factorial(int n){
        int fact = 1;
        for (int i = 1; i <=n; i++) {
            fact = fact *i;
        }
        System.out.println("Factorial of a number " + fact);
    }

    public static void table(int n){
        
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " * " + i +" = " + result);

    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        table(n);
        factorial(n);
    }
}
