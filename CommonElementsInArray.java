import java.util.*;
import java.io.*;


public class CommonElementsInArray {
   
    static void commonElements(String[] arr1,String[] arr2){
        HashSet<String> set=new HashSet<String>();
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        
        for(String i:set){
            System.out.print(i+" ");
        }
       
   }
   
    public static void main(String args[]) {
     String[] arr1={"bear","cat","dog","fish","monkey","cat","bird"};
     String[] arr2={"lion","cat","bear","monkey"};

     System.out.println("Array 1: " + Arrays.toString(arr1));
     System.out.println("Array 2: " + Arrays.toString(arr2));
     System.out.println("Common Elements");
     commonElements(arr1,arr2);
     
    }
}
