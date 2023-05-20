public class BinarySearch {
    
    static int BinarySearch(int[] arr, int first, int last,int x){
        
       while(first<=last){
           int mid=first+(last-first)/2;
           
           if(arr[mid]==x)
            return mid;      // Check if x is present at mid
           
           if(arr[mid]<x){
               first=mid+1;  // If x greater, ignore left half
           }
           else{
               last=mid-1;   // If x smaller, ignore right half
           }
       }
       return -1;
       
        
    }
    
    public static void main(String args[]) {
     int arr[] = {2,3,4,10,40,70,83};
        int n = arr.length;
        int x = 70;
        
        int result=BinarySearch(arr,0,n,x);
        if(result==-1){
            System.out.println("element not found");
        }
        else{
        System.out.println("element found at " + result);
        }
    }
}
