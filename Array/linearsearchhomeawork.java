import java.util.*;
import java.lang.String;
public class linearsearchhomeawork {

    public static int search(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String menu[]={"Samosa","Idali","Dhevbahji","vadapav"};
        System.out.println("Enter your item whih you want to search");

        String key=sc.nextLine();
        int index=search(menu,key);
        if (index==1){
            System.out.println("Found");
        }else{
            System.out.println("NOt found");
        }


    }
}
