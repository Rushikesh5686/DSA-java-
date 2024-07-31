public class reversearray {
    public static void reverse(int a[]){
        int start=0;
        int last=a.length-1;

        while(start<last){
             int temp=a[last];
            a[last]=a[start];
            a[start]=temp;
            start++;
            last--;
        }
    }
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};
        reverse(a);
        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
