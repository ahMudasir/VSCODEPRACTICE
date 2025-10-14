package bin.JavaProject;

class Overload{

    public static int add(int a , int b){
    return a+b;
     }
     public static int add(int a, int b, int c){
                 return a+b+c;

     }
    }
public class OverloadInJava {
    public static void main(String[] args)
     {
        Overload o = new Overload();
    int result = o.add(5, 6);
    System.out.println(result);
    }
}
