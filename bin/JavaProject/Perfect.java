package bin.JavaProject;
import java.util.Scanner;

public class Perfect {
        /*
         * A Perfect Number is a number that is equal to the sum of its proper divisors (excluding the number itself).
         */
        /*
         * Take a number n

            Find all numbers less than n that divide n completely

            Add them up

            If sum == n → Perfect number
            else → Not perfect
         */
    public static void main(String[] args) {
         Scanner sc = new Scanner( System.in);

         System.out.println("Enter number");
         int n = sc.nextInt();
            int sum =0;

            for (int i = 1; i < n; i++) {
                if (n % i==0) { 
                    sum +=i;
                    
                }
            }
         if (sum == n)
            System.out.println(n + " is a Perfect number.");
        else
            System.out.println(n + " is not a Perfect number.");
    }
}