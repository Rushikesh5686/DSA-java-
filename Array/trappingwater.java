
public class trappingwater {
    public static void trap(int height[]){
        //calculate left max boudry
        int n=height.length;
        int leftboundry []= new int[n];
        leftboundry[0]=height[0];
        for(int i=1;i<n;i++){
            leftboundry[i]=Math.max(height[i],leftboundry[i-1]);
            System.out.print(leftboundry[i]);
        }
        System.out.println();
        //calculate rightmostboundry
        int rightboundry []= new int [n];
        rightboundry[n-1]=height[n-1];
        System.out.print(rightboundry[n-1]);
        for(int i=n-2;i>=0;i--){
            rightboundry[i]=Math.max(height[i],rightboundry[i+1]);
            System.out.print(rightboundry[i]);
        }
        System.out.println();
        //calculate trapping
        int trappwater=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftboundry[i],rightboundry[i]);
            trappwater+=waterlevel-height[i];
        }
        System.out.println(trappwater);

    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        trap(height);
    }
}
