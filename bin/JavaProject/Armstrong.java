package bin.JavaProject;

import java.util.Scanner;

public class Armstrong {
    public static void Armstrong(int n){

        int sum = 0;
        int n2=n;
        while (n>0) 
        {   
            int digit = n%10;
            sum += (digit*digit*digit);
            n = n/10;   
        }
        if (sum==n2) System.out.println("Armstrong");
            else System.out.println("Not Armstrong");
        }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                    System.out.println("Enter number");
                    int n= sc.nextInt();
                          Armstrong(n);   
                        sc.close(); // optional but good practice ✅
    }
}

