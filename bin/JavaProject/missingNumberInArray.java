package bin.JavaProject;

import java.util.Scanner;

public class missingNumberInArray {

    public static int missing(int arr[]){
        int n = arr.length +1;
        int total = n * (n+1)/2;
        int sum =0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return total - sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements (n - 1): ");
        int num = sc.nextInt();

        int arr[] = new int[num];
                System.out.println("Enter " + num + " numbers (from 1 to n, missing one number):");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int result = missing(arr);
        System.out.println("Missing number is  " + result);

    }
}
