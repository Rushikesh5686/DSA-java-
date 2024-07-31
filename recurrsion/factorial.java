package recurrsion;

public class factorial {
    public static int  fact(int n){
        if(n==0){
            return 1;
        }
        int fnmone=fact(n-1);
        int fn=n*fnmone;
        return fn;

    }

    public static void main(String[] args) {
        System.out.println(fact(5));

    }
}
