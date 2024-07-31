package bitwiseoperator;

public class SWappingusingbitwise {
    public static void main(String[] args) {
        System.out.println("Before Swapping");
        int a=15;
        int b=20;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("**Without using a Third varaible and + and - operator or arithmatic operator");
        System.out.println("Before Swapping");
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}
