 import java.util.*;
public class BinSearch {
    //In Assending order every single element is > = the privious element
    public static void main(String[] args) {
         int arr[] = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
         int target = 22;
         int ans = binarySearch(arr, target);
         System.out.println(ans);
    }

    static int binarySearch(int arr[],int target){
        int start = 0;

        int end = arr.length-1;

        while(start<=end){

        //find th middle element
        // int mid=(start+end)/2; //might be possible that (start + end)
        // exceeds the range of integers java

        int mid = start + (start + end)/2;


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
        return -1;
    }
}
