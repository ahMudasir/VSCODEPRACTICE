        package bin.JavaProject;

        import java.util.Scanner;

        public class hcfnlcm {

                public static int hcf(int a, int b) {
                while (b != 0) {
                    int temp = b;
                    b = a % b;
                    a = temp;
                }
                return a;
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter two numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();

                int h = hcf(a, b);
                int l = (a * b) / h;

                System.out.println("HCF = " + h);
                System.out.println("LCM = " + l);

            
            }
            
        }
