            package bin.JavaProject;

            import java.util.Scanner;

            /*
            * palindrome of a number
            */
                public class practice3 {
                    public static void maxNumber(int num){
                        int largest = 0;

                    while (num != 0) {
                        int digit = num % 10;
                        if (digit > largest)
                            largest = digit;
                        num /= 10;
        }
        System.out.println("Largest digit = " + largest);
    }

                    public static void swap(int a, int b){
                        a = a + b;
                        b = a - b;
                        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);
                    }

                public static void isPalindrome(int n){
                    int original =n , reverse=0;

                    while (n!=0) {
                        int digit = n%10;
                        reverse = reverse *10 + digit;
                        n=n/10;

                    }
                    if (original==reverse) 
                        System.out.println(reverse+ " is  Palindrome");
                    else
                        System.out.println("is not Palindrome");
                    
                }

            public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);

                    System.out.println("Enter number for palindrome");

                    int n= sc.nextInt();

                    System.out.println("a");
                    int a = sc.nextInt(); 

                    System.out.println("b");
                    int b = sc.nextInt();

                    System.out.print("Enter a number for largest: ");
                    int num = sc.nextInt();

                    //calling methods
                    isPalindrome(n);
                    swap(a, b);
                    maxNumber(num);
            }
                
            }
