import java.util.Scanner;
public class sorting{
    public static void main(String [] args){
   Scanner Sc = new Scanner(System.in);
   int n = Sc.nextInt();
   int arr[] = new int[n];
        for(int i=0; i<n; i++){
        int value = Sc.nextInt();
        arr[i]=value;
       }
       for(int step=1; step<n; step++){
          for(int i=0; i<n-step; i++){
              if(arr[i]>arr[i+1]){
               int temp = arr[i];
               arr[i]=arr[i+1];
               arr[i+1]=temp;
              }
              
          }
       }
       for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
       }
       
     }
}
    

    
