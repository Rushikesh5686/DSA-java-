package basicsorting;

public class insertionsort {
    public static void insersort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr= arr[i];
            int prev= i-1;
                    //finding out the correct pos
            while (prev>=0 &&  arr[i-1]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]= curr;
        }
    }
    public static void show(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" | ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={1,5,6,8,75};
        insersort(arr);
        show(arr);
    }
}
