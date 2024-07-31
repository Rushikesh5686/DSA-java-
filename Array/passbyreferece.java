public class passbyreferece {
    public static void update(int marks[],int a){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
             a=20;
        }
    }
    public static void main(String[] args) {
       int marks[]={80,87,89};
       int a=12;
       update(marks,a);
       for(int i=0;i<marks.length;i++){
           System.out.print(" "+marks[i]); //change the array because it pass by reference
       }
        System.out.println();
        System.out.println(a); //not change value pass by value
    }

}
//so arraya is pass by an refernce and normal value pass by value