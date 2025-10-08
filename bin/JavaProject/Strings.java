           
           package bin.JavaProject;
            import java.util.Scanner;
            public class Strings {

            public static void reverse(String n){
                String rev ="";
                for (int i = n.length()-1; i >= 0; i--) {
                    rev += rev.charAt(i);
                }
                System.out.print(rev);
            }
            public static void main(String[] args) {
                /*
                 Strings : These are the sequense of characters  enclosed by double quotes
                 They are immutable cant change once created
                */ 
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter String");
                String n = sc.nextLine();
                reverse(n);
                String str = "hello world";
                String st = "world";
                String s = new String ("Hello");
                System.out.println(s);
                System.out.println(str);
                System.out.println(str==st); // 
                System.out.println(str.equals(s));//equals to sign
                String sos = str.concat(s);
                System.out.println(sos);
               
                System.out.println("---------------------\n");

                System.out.println("\nSerial Number\tCharacter");
                System.out.println("---------------------------");

                for (int i = 0; i < str.length(); i++) {
                    System.out.println(i + "\t\t\t" + str.charAt(i));
                }

                System.out.println(str.replace(" ", "")); // need to remove spacehell
            
            }
            
        }