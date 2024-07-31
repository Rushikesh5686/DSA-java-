package basicsorting;

public class Bubblesort {
    public static void sort(int arr[]){
        int swapp=0;
        for(int turn=0;turn<arr.length-1;turn++){

            for(int i=0;i<arr.length-1-turn;i++){
                if(arr[i]>arr[i+1]){
                    //swap
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;



                }swapp++;
            }
        }System.out.println(swapp);

    }
    public static void show(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[]={1,2,3};
        sort(arr);
        show(arr);

    }
}
