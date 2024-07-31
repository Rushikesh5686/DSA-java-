import java.util.*;
public class linearsearch {
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers []= new int[5];
        System.out.println("Enter your values");

        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter key which you want  search");
        int key=sc.nextInt();

        int index=linearsearch(numbers,key);
        if (index==1){
            System.out.println("Value is Found");
        }else{
            System.out.println("Not found");
        }

    }
}
///the complexity of linear search in O(n);
