    package bin.JavaProject;

    import java.util.Scanner;

    public class isStringPalindrome {

        public static void palindrome(String str){

            String rev = "";

            for (int i = str.length()-1; i >= 0 ; i--) {
                rev += str.charAt(i);
            }
            if (str.equalsIgnoreCase(rev)) {
                System.out.println(rev+ " is Palindrome");
            }
            else{
                System.out.println(rev + " is Not Palindrome");
            }
        
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            System.out.println("Enter String");
            String str = sc.nextLine();

            palindrome(str);


        }
        
    }
