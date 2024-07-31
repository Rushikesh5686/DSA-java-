package divideandconquer;

public class quicksort {
    public static void show(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quick(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int piIndx= partition(arr,si,ei);
        quick(arr,si,piIndx-1); //left
        quick(arr,piIndx+1,ei); //rigth

    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<pivot){
                i++;
                //swapp
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;


    }
    public static void main(String[] args) {
        int arr[]={4,65,6,63,3,37,12,1,23};
        quick(arr,0,arr.length-1);
        show(arr);
    }
}
