package recurrsion;

public class sum {
    public static int sumno(int n){
        if(n==1){
            return 1;
        }
        int snmone=sumno(n-1);
        int sn=n+snmone;
        return sn;
    }
    public static void main(String[] args) {
        System.out.println(sumno(5));
    }
}
