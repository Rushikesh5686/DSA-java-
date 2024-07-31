package divideandconquer;

public class mergesort {
    public static void show(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergesort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=(si+ei)/2;
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        merge(arr,si,mid,ei);


    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[]=new int[ei-si+1];
        int i=si; //idx for 1st sorted array
        int j=mid+1; //idx for 2nd sorted array
        int k=0; //idx for temp array
        while (i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //for left over element\
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        // for right over element
        while (j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp to oroginal
        for( k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }


    }



    public static void main(String[] args) {
      int arr[]={5,6,7,8,4,2,9};
      show(arr);
      mergesort(arr,0,arr.length-1);
        System.out.println(arr);
        show(arr);
    }
}
