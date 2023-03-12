import java.util.*;
public class CeilingOfNumber {   
          //In Assending order every single element is > = the privious element
          public static void main(String[] args) {
            int arr[] = {2,3,5,9,14,16,18};
            int target = 15;
               int ans = CeilingNumber(arr, target);
               System.out.println(ans);
          }
           // return tne index of smallest number > = target
          static int CeilingNumber(int arr[],int target){
      // but what if target is greater than th greatest number in the array

      if(target > arr[arr.length-1]){
            return -1;
      }
            int start = 0;
      
              int end = arr.length-1;
      
              while(start<=end){
      
              //find th middle element
              // int mid=(start+end)/2; //might be possible that (start + end)
              // exceeds the range of integers     java
      
              int mid = start + (end - start)/2;
      
      
              if(target < arr[mid]){ // the element should be L.H.S
                  //   So Start will not Change ut End will change
                  end = mid -1;
              }else if(target > arr[mid]){
                  // So End will not Change ut Start  will change
                  start = mid + 1;
              }else{
                  //ans found
                  return mid;
              }
              }
      
              // if ans not found
              return start;
          }
      }
      

