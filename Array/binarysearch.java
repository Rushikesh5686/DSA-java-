public class binarysearch {
    public static int bianarysearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;

        while (start<=end){
            int mid=(start+end)/2;
            if (numbers[mid]==key){
                return mid;
            }
            if (numbers[mid]>key){
                //left side
                end=mid-1;
            }else{
                start=mid+1;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,50,60}; //alrady sorted
        int key=350;
        int index=bianarysearch(numbers,key);
        if(index>=0){
            System.out.println("The index is :"+index);
        }else System.out.println("Not exist");


    }
}
