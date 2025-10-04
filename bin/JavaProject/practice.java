                        package bin.JavaProject;

                        import java.util.Scanner;

                        public class practice {


                    public static void palindrome(int number){
                                        int original =number;
                                        int reversed =0;
                                        while (number!=0) {
                                            int digit = number % 10;
                                        reversed = reversed * 10 + digit;
                                        number /= 10;
                                        }
                                        if (original == reversed) {
                        System.out.println(original + " is a palindrome.");
                                    } else {
                        System.out.println(original + " is not a palindrome.");
                        }

                            }
                            public static void reversedd(int num){
                                int reversed = 0;
                                    while (num != 0) {
                                        int digit = num % 10;
                                        reversed = reversed * 10 + digit;
                                        num /= 10;
                                    }
                                    System.out.println(reversed);
                            }

                        public  static void rev(String str){
                                String reversed ="";
                                for (int i = str.length()-1; i >=0; i--) {
                                    reversed += str.charAt(i);
                                
                                }
                                System.out.println(reversed);
                            }

                        public static void factorial(int n){
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

                                System.out.println("Enter number for table and factorial:");
                                int n = sc.nextInt();
                                sc.nextLine(); // consume leftover newline

                                System.out.println("Enter a string to reverse:");
                                String str = sc.nextLine();

                                System.out.println("Enter a number to reverse:");
                                int num = sc.nextInt();

                                System.out.println("Enter a number to check palindrome:");
                                int number = sc.nextInt();

                                

                                table(n);
                                factorial(n);
                                rev(str);
                                reversedd(num);
                                palindrome(number);

                            } 
                        }
