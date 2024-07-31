import java.lang.*;

import static java.lang.Integer.MIN_VALUE;

public class maxsumsubarray {
    public static void maxsub(int a[]){
        int currsum=0;
        int maxsum=MIN_VALUE;
        for(int i=0;i<a.length;i++){
            int start =i;

            for(int j=i;j<a.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                     currsum+=a[k];


                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
                //System.out.println();

            }
            System.out.println();
        }
        System.out.println(maxsum);

    }

    public static void main(String[] args) {
        int a[]={4,6};
        maxsub(a);

    }
}
