package bitwiseoperator;

public class evenorodd {
    public static void evenorodd(int n){
        int bitmap=1;
        if((n & bitmap)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }



    public static void main(String[] args) {
        evenorodd(2);
        evenorodd(5);
    }
}
