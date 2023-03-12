//public class BInSearch {
//    public static void main(String[] args) {
//        int arr[] = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
//        int target = 22;
//        int ans = orderAgnosticBS(arr, target);
//        System.out.println(ans);
//    }
//
//
//    static int orderAgnosticBS(int arr[],int target){
//        int start = 0;
//        int end = arr.length-1;
//
//// find whether the array is sorted in asending or Descending.
//
//        boolean isAsc;
//
//        if(arr[start]<arr[end]){
//            isAsc = true;
//        }else{
//            isAsc = false;
//        }
//
//        // boolean isAsc = arr[start]<arr[end];
//
//        while(start<=end){
//
//            int mid = start + (start + end)/2;
//
//            if(arr[mid]==target){
//                return mid;
//            }
//
//// if it is asending order do this
//
//            if(isAsc){
//                if(target < arr[mid]){ // the element should be L.H.S
//                    //   So Start will not Change ut End will change
//                    end = mid -1;
//                }else{
//                    // So End will not Change ut Start  will change
//                    start = mid + 1;
//                }
//            }
//            // if it is desending order Do this
//            else {
//                if(target > arr[mid]){ // the element should be L.H.S
//                    //   So Start will not Change ut End will change
//                    end = mid -1;
//                }else {
//                    // So End will not Change ut Start  will change
//                    start = mid + 1;
//                }
//            }
//        }
//        return -1;
//    }
//}
