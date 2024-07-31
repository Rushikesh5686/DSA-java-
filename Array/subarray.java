public class subarray {
    public static void subarray(int a[]){
        int count=0;
        for(int i=0;i<a.length;i++){
            int start =i;
            for(int j=0;j<a.length;j++){
                int end=j;

                for(int k=start;k<=end;k++){
                    System.out.print(a[k]+" ");


                }
                 
                //System.out.println();

            }
            System.out.println();
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int a[]={2,4};
        subarray(a);
    }
}
