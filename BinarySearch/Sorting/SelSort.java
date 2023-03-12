package BinarySearch.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelSort {
    
    static void selectionSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the maximum item in the array and swap with correct
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);

            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first] = arr[second];
        arr[second] = temp; 
    }

     static int getMaxIndex(int[] arr,int start,int end){
        int max = start;

        for (int i = 0; i <= end ; i++) {
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
        }

    public static void main(String[] args) {
        int arr[] = {3,1,5,4,2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
