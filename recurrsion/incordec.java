package recurrsion;

public class incordec {
    public static void printdec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }
    public static void printinc(int n){
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printinc(n-1);
        System.out.print(n +" ");
    }
    public static void main(String[] args) {
        int n=5;
        printdec(n);
        printinc(10);
    }
}
