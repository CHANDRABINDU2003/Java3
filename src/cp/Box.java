
package cp;


public class Box {
    double height, width,length;
    Box(double h, double l, double w){
        height=h;
        length=l;
        width=w;
    }
    void displayVol(){
       double vol= height*width*length;
        System.out.println(""+vol);
}}




 class InsertionSort {
    static void insert(int []arr){
      for(int i=0;i<arr.length;i++){
          int current=arr[i];
           
          int j= i-1;
          while(j>=0&&arr[j]>current){
             arr[j+1]=arr[j]; 
             j--;
          }
          arr[j+1]=current;
      }  
    }
    public static void main(String[] args) {
      int []arr={5,2,9,1,7,12};
        System.out.println("before sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        insert(arr);
        System.out.println("after sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
