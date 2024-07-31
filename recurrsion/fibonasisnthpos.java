package recurrsion;

public class fibonasisnthpos {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibmone=fib(n-1);
        int fibmtwo=fib(n-2);
        int fibo=fibmone+fibmtwo;
        return fibo;
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fib(10));
    }
}
