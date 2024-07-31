import java.util.*;

public class findlargestandsmallestvalue {
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE; // -infinity
        int smallest=Integer.MAX_VALUE; // +infinity
        for (int i=0;i<numbers.length;i++){
            if (largest<numbers[i]){
                largest=numbers[i];
            }
            if (smallest>numbers[i]){
                smallest=numbers[i];
            }

        }System.out.println("The smallest is: " + smallest);
        return largest;

    }
    public static void main(String[] args) {
        int numbers[]= {10,65,45,78,63,87,100,486,89,5,52};
        System.out.println("The largest number is: "+getlargest(numbers));


    }
}
